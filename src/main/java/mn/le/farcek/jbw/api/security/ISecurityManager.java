/*
 * Copyright (C) 2014 Farcek
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package mn.le.farcek.jbw.api.security;

import java.util.List;
import java.util.Set;
import mn.le.farcek.jbw.api.action.IActionSession;

/**
 *
 * @author Farcek
 */
public interface ISecurityManager {

    public final static String JBW_CURRENT_USER_ATTR = "JBWCurrentUser";
    public final static String JBW_CURRENT_ROLES_ATTR = "JBWCurrentRoles";
    public final static String JBW_MEMBER_ROLE = "member";

    public String encryptPassword(String pass, String salt);

    public SecurityRole getSecurityRole();

    public void setAuthentication(IUser user, IActionSession session);

    public void clearAuthentication(IActionSession session);

    public IUser getAuthentication(IActionSession session);

    public Set<String> getCurrentRoles(IActionSession session);

    public void addCurrentRole(String role, IActionSession session);
}
