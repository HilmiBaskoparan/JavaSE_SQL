package hilmibaskoparan.controller;

import hilmibaskoparan.dao.RegisterDao;
import hilmibaskoparan.dto.RegisterDto;

import java.sql.SQLException;
import java.util.ArrayList;

public class RegisterControllerImpl implements IRegisterController {

    private RegisterDao registerDao = new RegisterDao();

    // CREATE
    @Override
    public void create(RegisterDto registerDto) throws SQLException, ClassNotFoundException {
        registerDao.create(registerDto);
    }

    // UPDATE
    @Override
    public void update(RegisterDto registerDto) {
        registerDao.update(registerDto);
    }

    // DELETE
    @Override
    public void delete(RegisterDto registerDto) {
        registerDao.delete(registerDto);
    }

    // LIST
    @Override
    public ArrayList<RegisterDto> list() {
        return registerDao.list();
    }

    @Override
    public RegisterDto findById(Long id) {
        return registerDao.findById(id);
    }
}
