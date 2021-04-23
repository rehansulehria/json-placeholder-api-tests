package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    public int id;
    public String name;
    public String username;
    public String email;
    public List<String> address;
    public String phone;
    public String website;
    public List<String> Company;



}
