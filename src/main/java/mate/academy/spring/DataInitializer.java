//package mate.academy.spring;
//
//import java.util.List;
//import javax.annotation.PostConstruct;
//import mate.academy.spring.model.Role;
//import mate.academy.spring.model.User;
//import mate.academy.spring.security.RoleName;
//import mate.academy.spring.service.RoleService;
//import mate.academy.spring.service.UserService;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataInitializer {
//    private final RoleService roleService;
//    private final UserService userService;
//
//    public DataInitializer(RoleService roleService, UserService userService) {
//        this.roleService = roleService;
//        this.userService = userService;
//    }
//
//    @PostConstruct
//    public void inject() {
//        Role adminRole = new Role();
//        adminRole.setRole(RoleName.ADMIN);
//        roleService.add(adminRole);
//        Role userRole = new Role();
//        userRole.setRole(RoleName.USER);
//        roleService.add(userRole);
//        User user = new User();
//        user.setEmail("admin@i.ua");
//        user.setPassword("admin123");
//        user.setRoles(List.of(adminRole));
//        userService.add(user);
//    }
//}
