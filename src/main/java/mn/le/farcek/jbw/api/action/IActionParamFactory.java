/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.action;

import mn.le.farcek.http.request.HttpRequest;

/**
 *
 * @author Farcek
 */
public interface IActionParamFactory {

    IActionRequest factoryActionRequest();

    HttpRequest factoryHttpRequest();

    IActionSession factoryActionSession();

    IRequestHeader factoryRequestHeader();

    IResponseHeader factoryResponseHeader();

    IActionSecurity factorySecurity();

    IActionRequestPart factoryActionRequestPart(String partName);

    <T> T factoryObjectFromJsonRequest(Class<T> type);
}
