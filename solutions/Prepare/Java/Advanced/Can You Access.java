//https://www.hackerrank.com/challenges/can-you-access/problem

o = new Inner().new Private();
Inner.Private innerPriv = (Inner.Private) o;

System.out.println(num + " is " + innerPriv.powerof2(num));
