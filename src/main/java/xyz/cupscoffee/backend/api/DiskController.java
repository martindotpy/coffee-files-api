package xyz.cupscoffee.backend.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/disks")
@AllArgsConstructor
public class DiskController {
    private final HttpSession session;
}
