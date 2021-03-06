package hwst.service.users;

import hwst.domain.users.SellerVo;
import hwst.domain.users.UserSection;
import hwst.domain.users.UsersVo;

public interface UsersService {
	boolean updateUsers(UsersVo vo) throws Exception;
	boolean deleteUsers(int userNo, UserSection userSection) throws Exception;
	String checkUsersId(String id) throws Exception;
	UsersVo loginUsers(UsersVo vo) throws Exception;
	boolean signupBuyer(UsersVo user) throws Exception;
	boolean signupSeller(SellerVo vo) throws Exception;
	UsersVo selectUserOne(int userNo) throws Exception;
}
