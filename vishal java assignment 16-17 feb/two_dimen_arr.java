
class array_demo{

void arr(){
	int a[][]={
		{1,2,3,4},
		{4,5,6,5}
		};
	//int a1[][];
	   //  System.out.println(a.length);
			for(int i=0;i<=2;i++){

				for(int j=0;j<=2;j++){

					System.out.println(a[i][j]);
					}
			System.out.println();
			}

		/*	for(int i=0; i < a.length; i++){

								for(int j = 0; j < a[i].length; j++){

								System.out.println(a[i][j]);
								}
						System.out.println();
			}*/

	}
}

class two_dimen_arr{
public static void main(String[] args){
array_demo ob=new array_demo();
ob.arr();
}
}