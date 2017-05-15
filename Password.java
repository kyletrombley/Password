import java.lang.StringBuffer;
public class Password{
   public void findPass(int len){
      String allChar[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
         "0", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
         "n", "o", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "!", "@",
         "#", "$", "%", "^", "&", "*", "(", ")", "~", "`", "?", "/", "|", "\\",
         "{", "}", ",", "<", ".", ">", "[", "]", "+", "=", "_", "-", " ", ":", ";"};
      StringBuffer comp = new StringBuffer(len);
      for (int i = 0; i < len; i++)
         comp.append(allChar[0]);
   
   }   
}