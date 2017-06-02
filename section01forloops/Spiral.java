package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class Spiral
{
  public static void main(String[] args)
  {
    //    Show the tortoise --#1
    Tortoise.show();
    //    Make the tortoise go as fast as possible --#4
    Tortoise.setSpeed(10);
    //    Add Blue Violet to the Color Wheel --#7 HINT: Use the ColorWheel object
    ColorWheel.addColor(PenColors.Purples.BlueViolet);
    //    Add Violet to the Color Wheel --#8
    ColorWheel.addColor(PenColors.Purples.Violet);
    //    Add Purple to the Color Wheel --#9
    ColorWheel.addColor(PenColors.Purples.Purple);
    //    Do the following 75 times --#3.1
    for (int i = 0; i < 75; i++)
    {
      try
      {
        //         Change the pen color of the line the tortoise draws the next color on the Color Wheel --#6
        Tortoise.setPenColor(ColorWheel.getNextColor());
        //         Move the tortoise 5 times the current line number you are drawing --#5
        Tortoise.move(5 * i);
        //         Turn the tortoise 1/3 of 360 degrees to the right --#2
        Tortoise.turn(360 / 3);
      }
      catch (RuntimeException re)
      {
        MessageBox.showMessage("Hold up: " + re);
      }
      //    Repeat --#3.2
    }
  }
}
