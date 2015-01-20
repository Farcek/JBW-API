/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.security;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import mn.le.farcek.common.utils.FStringUtils;

/**
 *
 * @author Farcek
 */
public class SecurityRole {

    private final List<Role> roles = new ArrayList<>();

    public Role get(String role) {
        int i = roles.indexOf(new Role(role));
        if (i > -1) {
            return roles.get(i);
        }
        return null;
    }

    public Role create(String role) {
        return create(role, null);
    }

    public Role create(String role, String parent) {
        Role r = get(role);
        if (r == null) {
            r = new Role(role);
            roles.add(r);
        }

        if (FStringUtils.notEmpty(parent)) {
            Role p = get(parent);
            if (p == null) {
                p = new Role(role);
                roles.add(p);
            }
            p.childs.add(r);
        }
        return r;
    }

    @Override
    public String toString() {
        return "SecurityRole{" + "roles=" + roles + '}';
    }

    public class Role {

        private String role;
        private Set<Role> childs = new HashSet();

        public boolean hasAccess(String role) {
            if (this.role.equalsIgnoreCase(role)) {
                return true;
            }
            for (Role r : childs) {
                if (r.hasAccess(role)) {
                    return true;
                }
            }
            return false;
        }

        public Role(String role) {
            this.role = role;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public Set<Role> getChilds() {
            return childs;
        }

        public void setChilds(Set<Role> childs) {
            this.childs = childs;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 41 * hash + Objects.hashCode(this.role);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Role other = (Role) obj;
            return Objects.equals(this.role, other.role);
        }

        @Override
        public String toString() {
            return "Role{" + "role=" + role + ", childs=" + childs + '}';
        }
    }
}
