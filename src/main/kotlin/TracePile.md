|ligne exécutée| effet                               | pile d'appels                        |
|--------------|-------------------------------------|--------------------------------------|
|val a : Int = addition(4 + 5, 100)| appelle addition a:9 <br>y:100</br> | __main__                             |
| return a + y| retourne a=109                      | __addition__ <br>__main__</br>       |
| val b : Int = multiplication( multiplication(4, a), multiplication(2, 3) )| appelle multiplication b:109 x:4    | __main__ <br>__multiplication__</br> |
|    return x * b| retourne 436                        | __multiplication__ <br>__main__</br> |
| 




