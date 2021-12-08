package com;


import java.util.*;
import java.util.Map.*;


import javax.swing.text.html.HTMLDocument.Iterator;

public class Test {
public static void main(String[] args) {
HashMap p=new HashMap();
p.put(1+1, "Samantha");
p.put(0+1, "Kiran");
p.put(2+1, "Anushka");
Set s=p.entrySet();
Iterator i=s.i\terator();
while( i.hasNext()) {
	Map.Entry m=(Entry)i.next();
	System.out.println(m.getKey()+" "+m.getValue()+",");
}
System.out.println();
i=(Iterator) s.iterator();
while(i.next()) {
	Map.Entry m=(Entry)i.next();
	System.out.println(m.getKey()+" "+m.getValue()+",");
}
}
}


