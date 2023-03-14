class recurssion {
int fun(int x){
	if(x==10){
	return x;

	}else{
		System.out.println(x);
		fun(x+1);
		System.out.println(x);
		return x;
	}
}
}

public class recurssion_in_java{
public static void main(String [] args){

	recurssion ob = new recurssion();
	int x = 1 ;
	ob.fun(x);
}
}