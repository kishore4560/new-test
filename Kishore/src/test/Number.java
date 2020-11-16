package test;

import java.util.ArrayList;
import java.util.List;

public class Number {

public static void main(String[] args) {

List<Integer> nos = new ArrayList<Integer>();
nos.add(2); nos.add(55); nos.add(3); nos.add(11); nos.add(-1);
int count=0;
for(int i=0; i < nos.size(); i++) {
while(nos.get(i) != 0) {
	int number;
 number=nos.get(i)/10;
count++;
if(count==3) {
System.out.println(i);
break;

}
}

}
}
}