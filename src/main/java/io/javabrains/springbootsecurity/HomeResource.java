package io.javabrains.springbootsecurity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }
}
