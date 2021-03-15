package entity;

@Service
public class UserSS implements UserS{
    public EntityUser getUser(String login) {

        EntityUser user = new EntityUser();
        user.setLogin(login);
        user.setPassword("555");


        return null;
    }
}
