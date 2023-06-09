package hilmibaskoparan.controller;

import hilmibaskoparan.dto.RegisterDto;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IRegisterController {

    public void create(RegisterDto registerDto) throws SQLException, ClassNotFoundException;

    public void update(RegisterDto registerDto);

    public void delete(RegisterDto registerDto);

    public ArrayList<RegisterDto> list();

    public RegisterDto findById(Long id);
}
