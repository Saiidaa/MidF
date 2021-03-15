package entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

public class UserD {

    @Service()
    public static class UserD {

        @Autowired
        private UserS Service;
        @Override
        public UserD loadUser(String email) throws UsernameNotFoundException {
            User user = UserS.getUser("carr");
            Set<GrantedAuthority> roles = new HashSet();
            roles.add(new SimpleGrantedAuthority(Role.USER.name()));

            UserD userD =
                    new org.springframework.security.core.userdetails.User(user.getLogin(),
                            user.getPassword(),
                            roles);

            return userD;
        }

}
