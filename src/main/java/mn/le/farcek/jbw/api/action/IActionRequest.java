/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.action;

import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;


/**
 *
 * @author Farcek
 */
public interface IActionRequest {

    public Map<String, String[]> getParameterMap();

    public String[] getParameterValues(String name);

    public Enumeration<String> getParameterNames();

    public String getParameter(String name);
    public String getParameter(String name, String defaultValue);
    
    public Integer getIntParam(String name);
    public Integer getIntParam(String name, int defaultValue);
    
    public Long getLongParam(String name);
    public Long getLongParam(String name, long defaultValue);
    
    public Boolean getBooleanParam(String name);
    public Boolean getBooleanParam(String name, boolean defaultValue);
    
    public Float getFloatParam(String name);
    public Float getFloatParam(String name, float defaultValue);
    
    public Double getDoubleParam(String name);
    public Double getDoubleParam(String name, double defaultValue);
    
    public Date getDateParam(String name);
    public Date getDateParam(String name, String format);
    public Date getDateParam(String name, Date defaultValue);
    public Date getDateParam(String name, String format,Date defaultValue);
    

    public String getContentType();

    public Enumeration<String> getAttributeNames();

    public Object getAttribute(String name);

    public IActionMethod getMethod();
    public String getExtension();
    
    public Locale getLocale();
    
    public IActionRequestPart getPart(String name);

}
