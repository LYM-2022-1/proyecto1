/* Generated By:JavaCC: Do not edit this line. RobotTokenManager.java */
package uniandes.lym.robot.control;
import uniandes.lym.robot.kernel.*;
import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.LinkedList;
import java.util.ArrayList;

/** Token Manager. */
public class RobotTokenManager implements RobotConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x80fe1fffdf0L) != 0L)
         {
            jjmatchedKind = 40;
            return 2;
         }
         return -1;
      case 1:
         if ((active0 & 0x8000L) != 0L)
            return 2;
         if ((active0 & 0x80fe1ff7df0L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 1;
            return 2;
         }
         return -1;
      case 2:
         if ((active0 & 0xfe17f7db0L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 2;
            return 2;
         }
         if ((active0 & 0x800040L) != 0L)
            return 2;
         return -1;
      case 3:
         if ((active0 & 0xae00e0100L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 42;
               jjmatchedPos = 3;
            }
            return 2;
         }
         if ((active0 & 0x501015cb0L) != 0L)
            return 2;
         if ((active0 & 0x702000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 42;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 4:
         if ((active0 & 0x8c0040000L) != 0L)
            return 2;
         if ((active0 & 0x2200a0120L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 4;
            return 2;
         }
         if ((active0 & 0x702000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 42;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x200020100L) != 0L)
            return 2;
         if ((active0 & 0x20080020L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 5;
            return 2;
         }
         if ((active0 & 0x702000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 42;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0x80000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 42;
               jjmatchedPos = 5;
            }
            return -1;
         }
         if ((active0 & 0x20000020L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 6;
            return 2;
         }
         if ((active0 & 0x702000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 42;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x20000000L) != 0L)
            return 2;
         if ((active0 & 0x20L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 7;
            return 2;
         }
         if ((active0 & 0x80000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 42;
               jjmatchedPos = 5;
            }
            return -1;
         }
         if ((active0 & 0x702000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 42;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x20L) != 0L)
            return 2;
         if ((active0 & 0x700000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 42;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 32:
         jjmatchedKind = 44;
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 40:
         return jjStopAtPos(0, 25);
      case 41:
         return jjStopAtPos(0, 26);
      case 58:
         jjmatchedKind = 45;
         return jjMoveStringLiteralDfa1_0(0xf000000000L);
      case 61:
         return jjStopAtPos(0, 9);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x420000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x40700000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x40100L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x800080800L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x100010000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x5010L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x800000000c0L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x80022000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x420L);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 58:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(1, 46);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x420780800L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8100060100L);
      case 70:
      case 102:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 15, 2);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000080L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      case 79:
      case 111:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 42, 2);
         return jjMoveStringLiteralDfa2_0(active0, 0x815010L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0xa00000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x2460L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x400080880L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x100040100L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x41000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x702000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x3a00010000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x420L);
      case 84:
      case 116:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(2, 6, 2);
         else if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(2, 23, 2);
         break;
      case 86:
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x5010L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa4_0(active0, 0x702000L);
      case 69:
      case 101:
         if ((active0 & 0x10L) != 0L)
         {
            jjmatchedKind = 4;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x25000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 75:
      case 107:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 2);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 2);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
      case 78:
      case 110:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x800000020L);
      case 80:
      case 112:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 2);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0xc000000000L);
      case 84:
      case 116:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 2);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x2200040000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa5_0(active0, 0x5000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x20100L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 78:
      case 110:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 2);
         return jjMoveStringLiteralDfa5_0(active0, 0x200080000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x300000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x20L);
      case 83:
      case 115:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(4, 30, 2);
         break;
      case 84:
      case 116:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 2);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(4, 35, 2);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(4, 38);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(4, 39);
         return jjMoveStringLiteralDfa5_0(active0, 0x3000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(5, 33, 2);
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 72:
      case 104:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(5, 36);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(5, 37);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x202020L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x20400000L);
      case 82:
      case 114:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(5, 8, 2);
         break;
      case 84:
      case 116:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 17, 2);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa7_0(active0, 0x20L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa8_0(active0, 0x100000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x400000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa8_0(active0, 0x20L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa8_0(active0, 0x200000L);
      case 80:
      case 112:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(7, 19);
         break;
      case 82:
      case 114:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(7, 12);
         break;
      case 83:
      case 115:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(7, 13);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(7, 29, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa9_0(active0, 0x600000L);
      case 69:
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(8, 14);
         break;
      case 80:
      case 112:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(8, 20);
         break;
      case 84:
      case 116:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(8, 5, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 80:
      case 112:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(9, 21);
         else if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(9, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(2);
                  break;
               case 2:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjCheckNAdd(2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\75", null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, "\50", 
"\51", null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, "\40", "\72", "\40\72", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7fffeffffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[3];
private final int[] jjstateSet = new int[6];
protected char curChar;
/** Constructor. */
public RobotTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public RobotTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 3; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 13 && (0x2600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
