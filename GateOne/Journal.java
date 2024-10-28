public class Journal{
	String name;
	String address;
	String telephone;
	String email;
	Journal(String name,String address,String telephone,String email){
	this.name = name;
	this.address = address;
	this.telephone = telephone;
	this.email = email;

	}
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	public void editName(String newName){
		String temp = newName;
		newName = name;
		name = temp;
	}

	public void setAddress(String newAddress){
		address = newAddress;
	}
	public String getAddress(){
		return address;
	}
	public void editAddress(String newAddress){
		String temp = newAddress;
		newAddress = address;
		address = temp;
	}
	public void setTelephone(String newTelephone){
		if(newTelephone.length()==11){
			telephone = newTelephone;
		}
	}
	public String getTelephone(){
		return telephone;
	}
	public void editTelephone(String newTelephone){
		String temp = newTelephone;
		newTelephone = telephone;
		telephone = temp;
	}
	public void setEmail(String newEmail){
		char symbol = '@';
		int counter = 0;
		for(int count = 0;count<newEmail.length();count++){
			if(newEmail.charAt(count) == symbol){
				counter++;
			}
		}
		if(counter == 1){
			email = newEmail;
		}
	}
	public void editEmail(String newEmail){
		String temp = newEmail;
		newEmail = email;
		email = temp;
	}
	public String [] getcontact(){
		String [] register = {name ,address ,telephone ,email};
		return register;
	}
	public String getContact2(){
		String [] register = {name ,address ,telephone ,email};
		String book = "";
		for(int count = 0;count<register.length;count++){
			book +=register;
		}
		return book;
	}
	public String [] clearContact(){
		String temp = "";
		String temp2 = "";
		String temp3 = "";
		String temp4 = "";
		String temp5 = "";
		name = temp;
		temp2 = name;
		address = temp3;
		temp2 = address;
		telephone = temp4;
		temp2 = telephone;
		email = temp5;
		temp2 = email;
		String [] register = {name,address,telephone,email};
		return register;
	}
}