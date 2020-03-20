import java.util.Scanner;

/**
 * 
 * @author lefebvju
 *
 */
public class Level {
	/**
	 * 
	 * @param a
	 */
public void playLevel(int a) {
	if(a==1) {
		Scanner saisie =new Scanner(System.in);
		Vehicle CarPlay=new Vehicle("moi ",0,2,'x');
		Vehicle carBlue=new Vehicle("car1",3,1,'y');
		Vehicle carRed=new Vehicle("car2",3,3,'x');
		Map Park = new Map();
		Park.addCar(CarPlay);
		Park.addCar(carBlue);
	
		Park.addCar(carRed);
		
		System.out.println(Park.toString());
		
		while(CarPlay.getX()!=4) {
			
			System.out.println("1:advance\n2:back");
			int ent=saisie.nextInt();
			if(ent==1) {
				
				System.out.println("1:moi\n2:car1\n3:car2");
				ent=saisie.nextInt();
				if(ent==1) {
					Park.advance(CarPlay);
				}else if (ent==2) {
					Park.advance(carBlue);
				}else if (ent==3) {
					Park.advance(carRed);}
			}else if(ent==2) {
				System.out.println("1:moi\n2:car1\n3:car2");
				ent=saisie.nextInt();
				if(ent==1) {
					Park.back(CarPlay);
				}else if (ent==2) {
					Park.back(carBlue);
				}else if (ent==3) {
					Park.back(carRed);
			}}
			System.out.println(Park.toString());
		}
		System.out.println("Congratulations!!!");
	}else if(a==2) {
		Scanner saisie =new Scanner(System.in);
	Vehicle CarPlay=new Vehicle("moi ",1,2,'x');
	Vehicle car1=new Vehicle("car1",2,0,'x');
	Vehicle car2=new Vehicle("car2",0,1,'y');
	Vehicle car3=new Vehicle("car3",2,4,'y');
	Vehicle car4=new Vehicle("car4",4,4,'x');

	Vehicle bus1=new Vehicle("bus1",4,0,'y',3);
	Vehicle bus2=new Vehicle("bus2",5,0,'y',3);
	Vehicle bus3=new Vehicle("bus3",3,2,'y',3);
	Vehicle bus4=new Vehicle("bus4",3,5,'x',3);
	
	Map Park = new Map();
	Park.addCar(CarPlay);
	Park.addCar(car1);
	Park.addCar(car2);
	Park.addCar(car3);
	Park.addCar(car4);
	Park.addCar(bus1);
	Park.addCar(bus2);
	Park.addCar(bus3);
	Park.addCar(bus4);
	
	System.out.println(Park.toString());
	
	while(CarPlay.getX()!=4) {
		
		System.out.println("1:advance\n2:back");
		int ent=saisie.nextInt();
		if(ent==1) {
			
			System.out.println("1:moi\n2:car1\n3:car2\n4:car3\n5:car4\n6:bus1\n7:bus2\n8:bus3\n9:bus4");
			ent=saisie.nextInt();
			if(ent==1) {
				Park.advance(CarPlay);
			}else if (ent==2) {
				Park.advance(car1);
			}else if (ent==3) {
				Park.advance(car2);
			}else if (ent==4) {
				Park.advance(car3);
			}else if (ent==5) {
				Park.advance(car4);
			}else if (ent==6) {
				Park.advance(bus1);
			}else if (ent==7) {
				Park.advance(bus2);
			}else if (ent==8) {
				Park.advance(bus3);
			}else if (ent==9) {
				Park.advance(bus4);
			}
		}else if(ent==2) {
			System.out.println("1:moi\n2:car1\n3:car2\n4:car3\n5:car4\n6:bus1\n7:bus2\n8:bus3\n9:bus4");
			ent=saisie.nextInt();
			if(ent==1) {
				Park.back(CarPlay);
			}else if (ent==2) {
				Park.back(car1);
			}else if (ent==3) {
				Park.back(car2);
			}else if (ent==4) {
				Park.back(car3);
			}else if (ent==5) {
				Park.back(car4);
			}else if (ent==6) {
				Park.back(bus1);
			}else if (ent==7) {
				Park.back(bus2);
			}else if (ent==8) {
				Park.back(bus3);
			}else if (ent==9) {
				Park.back(bus4);
			}
			}
		System.out.println(Park.toString());
	}
	System.out.println("Congratulations!!!");

		
	}else if(a==3) {
		Scanner saisie =new Scanner(System.in);
		Vehicle CarPlay=new Vehicle("moi ",3,2,'x');
		Vehicle car1=new Vehicle("car1",1,0,'x');
		Vehicle car2=new Vehicle("car2",4,0,'y');
		Vehicle car3=new Vehicle("car3",1,1,'y');
		Vehicle car4=new Vehicle("car4",2,1,'y');
		Vehicle car5=new Vehicle("car5",3,3,'y');
		Vehicle car6=new Vehicle("car6",2,4,'y');
		Vehicle car7=new Vehicle("car7",4,4,'x');
		Vehicle car8=new Vehicle("car8",0,5,'x');
		Vehicle car9=new Vehicle("car9",3,5,'x');
		Vehicle bus1=new Vehicle("bus1",0,0,'y',3);
		Vehicle bus2=new Vehicle("bus2",5,1,'y',3);
		Vehicle bus3=new Vehicle("bus3",0,3,'x',3);
		
		Map Park = new Map();
		Park.addCar(CarPlay);
		Park.addCar(car1);
		Park.addCar(car2);
		Park.addCar(car3);
		Park.addCar(car4);
		Park.addCar(car5);
		Park.addCar(car6);
		Park.addCar(car7);
		Park.addCar(car8);
		Park.addCar(car9);
		Park.addCar(bus1);
		Park.addCar(bus2);
		Park.addCar(bus3);
		
		System.out.println(Park.toString());
		
		while(CarPlay.getX()!=4) {
			
			System.out.println("1:advance\n2:back");
			int ent=saisie.nextInt();
			if(ent==1) {
				
				System.out.println("1:moi\n2:car1\n3:car2\n4:car3\n5:car4\n6:car5\n7:car6\n8:car7\n9:car8\n10:car9\n11:bus1\n12:bus2\n13:bus3");
				ent=saisie.nextInt();
				if(ent==1) {
					Park.advance(CarPlay);
				}else if (ent==2) {
					Park.advance(car1);
				}else if (ent==3) {
					Park.advance(car2);
				}else if (ent==4) {
					Park.advance(car3);
				}else if (ent==5) {
					Park.advance(car4);
				}else if (ent==6) {
					Park.advance(car5);
				}else if (ent==7) {
					Park.advance(car6);
				}else if (ent==8) {
					Park.advance(car7);
				}else if (ent==9) {
					Park.advance(car8);
				}else if (ent==10) {
					Park.advance(car9);
				}else if (ent==11) {
					Park.advance(bus1);
				}else if (ent==12) {
					Park.advance(bus2);
				}else if (ent==13) {
					Park.advance(bus3);
				}
			}else if(ent==2) {
				System.out.println("1:moi\n2:car1\n3:car2\n4:car3\n5:car4\n6:car5\n7:car6\n8:car7\n9:car8\n10:car9\n11:bus1\n12:bus2\n13:bus3");
				ent=saisie.nextInt();
				if(ent==1) {
					Park.back(CarPlay);
				}else if (ent==2) {
					Park.back(car1);
				}else if (ent==3) {
					Park.back(car2);
				}else if (ent==4) {
					Park.back(car3);
				}else if (ent==5) {
					Park.back(car4);
				}else if (ent==6) {
					Park.back(car5);
				}else if (ent==7) {
					Park.back(car6);
				}else if (ent==8) {
					Park.back(car7);
				}else if (ent==9) {
					Park.back(car8);
				}else if (ent==10) {
					Park.back(car9);
				}else if (ent==11) {
					Park.back(bus1);
				}else if (ent==12) {
					Park.back(bus2);
				}else if (ent==13) {
					Park.back(bus3);
				}
				}
			System.out.println(Park.toString());
		}
		System.out.println("Congratulations!!!");
	}
}
}
