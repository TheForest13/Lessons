public class lab3 {
    public static void main(String[] args) {
        int a,b;                            // AE0: = ()
        int c = 0;                          // AE1: = ()
        int d = 0;                          // AE2: = ()
        a = c + 3;                          // AE3: = (c, 3)
        b = d + a;                          // AE4: = (d, c+3)
        for(int i = 0; i < 7; i++){         // AE5: = ()
            c += a;                         // AE6: = (c, c+3)
            b += a - 1;                     // AE7: = (d+a, c+3 - 1)
        }                                   // AE8: = ()
        if((a+a)%2 == 0){                   // AE9: =
            d += 1;                         // AE10: =
        }                                   // AE11: =
        while(true){                        // AE12: =
            a += 1;                         // AE13: =
            b += 1;                         // AE14: =
            c += 1;                         // AE15: =
            d += 1;                         // AE16: =
            if((a+b+c+d) > 57){             // AE17: =
                break;                      // AE18: =
            }                               // AE19: =
        }                                   // AE20: =
        do {                                // AE21: =
            a *= 2;                         // AE22: =
            d += 2;                         // AE23: =
            if((a+d) > (c + b)){            // AE24: =
                d = 0;                      // AE25: =
            }                               // AE26: =
        } while (d != 0);                   // AE27: =
        if(c > b){                          // AE28: =
            for (int i = 0; i < 5; i++){    // AE29: =
                d -= 1;                     // AE30: =
                for(int j = 0; j < 3; j++){ // AE31: =
                    c -= 2;                 // AE32: =
                }                           // AE33: =
            }                               // AE34: =
        }                                   // AE35: =
    }
}
