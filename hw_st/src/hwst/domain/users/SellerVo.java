package hwst.domain.users;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import hwst.domain.users.UserSection;

public class SellerVo extends UsersVo{

	String bankName;
	String accountNo;
	
	public SellerVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public SellerVo(int userNo, String id, String pw, String name,
			String phone, String postCode, String address, UserSection userSection) {
		super(userNo, id, pw, name, phone, address, postCode, userSection);
		// TODO Auto-generated constructor stub
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(
				this, ToStringStyle.MULTI_LINE_STYLE
				);
	}
	

	
	
}
