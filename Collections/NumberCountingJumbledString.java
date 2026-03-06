Description:
Write a program to find how many times the numbers can be formed by using the characters of a given string.


Constraints:
Input             :  First line of input consists of one String with jumbled characters

Outut            :   print the output in following order 

Constraints  :  String will contain only alphabetical letters.

                         String will not containy any extra characters.


Example:
Input 1    :    "hteihgeoneerthsixoenxsixis"

Output 1 :     one - 2

                      three - 1

                      six - 3

                      eight - 1

 

Input 2 :      "eonoezrvesenorezxisrhteegiehinentxisvenseixsinenvefiurofwot"

output 2 :    zero - 2
                    one - 1
                    two - 1
                    three - 1
                    four - 1
                    five - 1
                    six - 3
                    seven - 2
                    eight - 1
                    nine - 2


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        int six=0;
        int two=0;
        int eight=0;
        int four=0;
        int five=0;
        int one=0;
        int three=0;
        int nine=0;
        int seven=0;
        int zero=0;
        if(map.containsKey('x')){
            six=map.get('x');
            if(six>0){
                map.put('x',map.get('x')-six);
                map.put('s',map.get('s')-six);
                map.put('i',map.get('i')-six);
            }
        }
        if(map.containsKey('w')){
            two=map.get('w');
            if(two>0){
                map.put('w',map.get('w')-two);
                map.put('t',map.get('t')-two);
                map.put('o',map.get('o')-two);
            }
        }
        if(map.containsKey('g')){
            eight=map.get('g');
            if(eight>0){
                map.put('g',map.get('g')-eight);
                map.put('e',map.get('e')-eight);
                map.put('i',map.get('i')-eight);
                map.put('h',map.get('h')-eight);
                map.put('t',map.get('t')-eight);
            }
        }
        if(map.containsKey('u')){
            four=map.get('u');
            if(four>0){
                map.put('f',map.get('f')-four);
                map.put('o',map.get('o')-four);
                map.put('u',map.get('u')-four);
                map.put('r',map.get('r')-four);
            }
        }
        if(map.containsKey('f')){
            five=map.get('f');
            if(five>0){
                map.put('f',map.get('f')-five);
                map.put('i',map.get('i')-five);
                map.put('v',map.get('v')-five);
                map.put('e',map.get('e')-five);
            }
        }
        
        if(map.containsKey('i')){
            nine=map.get('i');
            if(nine>0){
                map.put('n',map.get('n')-(nine+nine));
                map.put('i',map.get('i')-nine);
                map.put('e',map.get('e')-nine);
            }
        }
        
        if(map.containsKey('v')){
            seven=map.get('s');
            if(seven>0){
                map.put('s',map.get('s')-seven);
                map.put('e',map.get('e')-(seven+seven));
                map.put('v',map.get('v')-seven);
                map.put('n',map.get('n')-seven);
            }
        }
        if(map.containsKey('z')){
            zero=map.get('z');
            if(zero>0){
                map.put('z',map.get('z')-zero);
                map.put('e',map.get('e')-zero);
                map.put('r',map.get('r')-zero);
                map.put('o',map.get('o')-zero);
            }
        }
        if(map.containsKey('e')){
            one=map.get('o');
            if(one>0){
                map.put('o',map.get('o')-one);
                map.put('n',map.get('n')-one);
                map.put('e',map.get('e')-one);
            }
        }
        if(map.containsKey('r')){
            three=map.get('r');
            if(three>0){
                map.put('t',map.get('t')-three);
                map.put('h',map.get('h')-three);
                map.put('r',map.get('r')-three);
                map.put('e',map.get('e')-(three+three));
            }
        }
        if(zero>0) System.out.println("zero - "+zero);
        if(one>0) System.out.println("one - "+one);
        if(two>0) System.out.println("two - "+two);
        if(three>0) System.out.println("three - "+three);
        if(four>0) System.out.println("four - "+four);
        if(five>0) System.out.println("five - "+five);
        if(six>0) System.out.println("six - "+six);
        if(seven>0) System.out.println("seven - "+seven);
        if(eight>0) System.out.println("eight - "+eight);
        if(nine>0) System.out.println("nine - "+nine);
    }
    
}



