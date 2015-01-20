/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.action.view;


import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 *
 * @author Farcek
 */
public interface IJsonParser {
    String toJson(Object object) throws IOException;
    public <T> T fromJson(String jsonString, Class<T> type) throws IOException;
    public <T> T fromJson(Reader reader, Class<T> cls) throws IOException;
    <T> List<T> fromListByJson(String jsonString, Class<T> type) throws IOException;

    
}
