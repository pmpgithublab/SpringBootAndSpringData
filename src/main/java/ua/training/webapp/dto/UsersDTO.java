package ua.training.webapp.dto;

import ua.training.webapp.entity.User;
import lombok.*;


import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UsersDTO {
    private List<User> users;
}
