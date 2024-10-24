public class Journal{
	String name;
	String address;
	String telephone;
	String email;
	Journal(){
	}
	public void setName(String newName){
		name = newname;
	}
	public void getName(){
		return name;
	}
	public void setAddress(String newAddress){
		address = newAddress;
	}
	public void getAddress(){
		return address;
	}
	public void setTelephone(String newTelephone){
		if(newTelephone.length()==11){
			telephone = newTelephone;
		}
	}
	public void getTelephone(){
		return telephone;
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
	public void getcontact(){
		String [] register = {name ,address ,telephone ,email};
		return register;
	}
	public void clearContact(){
		String temp;
		String temp2;
		String temp3;
		String temp4;
		String temp5;
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