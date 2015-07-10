package hwst.service;

import hwst.domain.users.SellerVo;
import hwst.domain.users.UsersVo;

import java.util.List;

public interface UsersService {
	boolean updateUsers(UsersVo vo);
	boolean deleteUsers(int userNo, int userSection);
	String checkUsersId(String id);
	UsersVo loginUsers(UsersVo vo);
	boolean signupBuyer(UsersVo user);
	boolean signupSeller(SellerVo vo);
	UsersVo selectUserOne(int userNo);
}
