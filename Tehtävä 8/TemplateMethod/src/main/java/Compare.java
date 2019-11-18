/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heidi
 */
public class Compare {
    
    public String compare(String a, String b){
        if ("kivi".equals(a)){
            if (b == "kivi") return "tie";
            if (b == "paperi") return b;
            if (b == "sakset") return a;
        }
        if ("paperi".equals(a)){
            if (b == "kivi") return a;
            if (b == "paperi") return "tie";
            if (b == "sakset") return b;
        }
        if ("sakset".equals(a)){
            if (b == "kivi") return b;
            if (b == "paperi") return a;
            if (b == "sakset") return "tie";
        }
        return "tie";
    }
}
