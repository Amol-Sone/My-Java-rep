/**
*This class converts measurements of length, from one length measurement to another length measurement.  This class can also convert from US customary untis to SI units, and vice versa as well.  
*This class also implements the measurementTypeConversion interface.  
*<br>
*
*@author  Amol Soneji
*@version 1.0, 19 Sept 2020
*/



public class convertLengthMeasurement implements measurementTypeConversion
{
  private static byte[] inputType;
  private static byte[] outputType;
  private static double input;
  private static double ouput;
  
  /**
  *This method takes in the parameters and automatically calls the methods for calculating the conversion.  It then returns the double data type value represented by output.  
  */
  public static double measurementConvert(byte[] inpType, byte[] outType, double inp)
  {
    inputType = inpType;
    outputType = outType;
    input = inp;
    if(inputType[0] == 0)//Check if US units
    {
      if(outputType[0] == 0)//Check if output is also requested in US units.
      {
        if(inputType[1] == outputType[1])//Same US unit measurements.  The result will always be the same (ex. input in inches and output in inches as well).  
        {
          output = input;
          return output;
        }
        else
        {
          usOnlyConvert();
          return output;
        }
      }
      else//Output is being requested in SI units.  
      {
        usToSiConvert();
        return output;
      }
    }
    else//Input is in SI units.  
    {
      if(outputType[0] == 0)//Check if output is being requested in US units.  
      {
        siToUsConvert();
        return output;
      }
      else//Ouput is being requested in SI units as well.  
      {
        if(inputType[1] == outputType[1])//Same SI unit measurements.  The result will always be the same (ex. input in cm and output in cm as well).  
        {
          output = input;
          return output;
        }
        else
        {
          siOnlyConvert();
          return output;
        }
      }
    }
  }
  
  /**
  *The following method is for converting between one US length measurement to another US length measurement.  This method does not return a value as it ustilizes the output field variable.  
  */
  private static void usOnlyConvert()
  {
    if(inputType[1] == 1)//Inches
    {
      
    }
    else if(inputType[1] == 2)//Feet
    {
      
    }
    else if(inputType[1] == 3)//Yards
    {
      
    }
    else//Miles
    {
      
    }
  }
  
  /**
  *The following method is for converting from a US length measurement to a SI unit length measurement.  This method does not return a value as it utilizes the output field variable.  
  */
  private static void usToSiConvert()
  {
    if(inputType[1] == 1)//Inches
    {
      
    }
    else if(inputType[1] == 2)//Feet
    {
      
    }
    else if(inputType[1] == 3)//Yards
    {
      
    }
    else//Miles
    {
      
    }
  }
  
  /**
  *The following method is for conerting between one SI unit length measurement to another SI unit length measurement.  
  *This method does not return a value as it utilizes the output field variable.  
  */
  private static void siOnlyConvert()
  {
    if(inputType[1] == 1)//Millimeter
    {
      
    }
    else if(inputType[1] == 2)//Centimeter
    {
      
    }
    else if(inputType[1] == 3)//Decimeter
    {
      
    }
    else if(inputType[1] == 4)//Hectometer
    {
      
    }
    else//Kilometer
    {
      
    }
  }
  
  /**
  *The following method is for converting from a SI unit length measurement to a US length measurement.  This method does not return a value as it utilizes the output field variable.  
  */
  private static void siToUsConvert()
  {
    if(inputType[1] == 1)//Milimeter
    {
      
    }
    else if(inputType[1] == 2)//Centimeter
    {
      
    }
    else if(inputType[1] == 3)//Decimeter
    {
      
    }
    else if(inputType[1] == 4)//Hectometer
    {
      
    }
    else//Kilometer
    {
      
    }
  }
}
