package cc.code;

// CPF - Cadastro de Pessoa Física
public class CPF {

   static public boolean CPF (String strCpf )
   {
      int     d1, d2;
      int     digit1, digit2, rest;
      int     CPFDigit;
      String  nDigResult;

      d1 = d2 = 0;
      digit1 = digit2 = rest = 0;

      for (int nCount = 1; nCount < strCpf.length() -1; nCount++)
      {
         CPFDigit = Integer.valueOf (strCpf.substring(nCount -1, nCount)).intValue();

         //multiply the last number by 2. the next one by 3, the next one by 4 and so on.
         d1 = d1 + ( 11 - nCount ) * CPFDigit;

       //To the second digit repeat the procedure adding the previous digit processed previously.
         d2 = d2 + ( 12 - nCount ) * CPFDigit;
      };

      //The rest of the division by 11.
      rest = (d1 % 11);

      //If result is 0 or 1, the digit2 should be zero(0) otherwise the last digit2 must be 11 minus the value of rest variable.
      if (rest < 2)
         digit1 = 0;
      else
         digit1 = 11 - rest;

      d2 += 2 * digit1;

      //Should calculate the second rest dividing d2 by 11
      rest = (d2 % 11);

      //Se o resultado for 0 ou 1 o digito e 0 caso contrario o digito e 11 menos o resultado anterior.
      //If result is 0 or 1, the digit2 should be zero(0) otherwise the last digit2 must be 11 minus the value of rest variable.
      if (rest < 2)
         digit2 = 0;
      else
         digit2 = 11 - rest;

      //CPF digit verifier.
      String nDigVerific = strCpf.substring (strCpf.length()-2, strCpf.length());

      //Concatenate the first rest value with the second one.
      nDigResult = String.valueOf(digit1) + String.valueOf(digit2);

      // Compare the CPF verifier digit with the first rest value + second rest value.
      return nDigVerific.equals(nDigResult);
   }

   
   public static void main(String[] args) {
      System.out.println( CPF("8989898") );
   }
   

}
