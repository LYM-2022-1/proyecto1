/* Generated By:JavaCC: Do not edit this line. RobotTokenManager.java */
package uniandes.lym.robot.control;
import uniandes.lym.robot.kernel.*;
import java.awt.Point;
import java.io.*;
import java.util.Vector;
import java.util.LinkedList;

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
         if ((active0 & 0xffe01fffdf8L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 0;
            return 7;
         }
         return -1;
      case 1:
         if ((active0 & 0x8000L) != 0L)
            return 7;
         if ((active0 & 0xffe01ff7df8L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 1;
            return 7;
         }
         return -1;
      case 2:
         if ((active0 & 0xffe017f7d58L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 2;
            return 7;
         }
         if ((active0 & 0x8000a0L) != 0L)
            return 7;
         return -1;
      case 3:
         if ((active0 & 0xffe000e0100L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 3;
            }
            return 7;
         }
         if ((active0 & 0x1015c58L) != 0L)
            return 7;
         if ((active0 & 0x702000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 4:
         if ((active0 & 0x40000L) != 0L)
            return 7;
         if ((active0 & 0x3ae000a0110L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 4;
            return 7;
         }
         if ((active0 & 0x702000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x20100L) != 0L)
            return 7;
         if ((active0 & 0x2200080010L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 5;
            return 7;
         }
         if ((active0 & 0x702000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0x200000010L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 6;
            return 7;
         }
         if ((active0 & 0x80000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 5;
            }
            return -1;
         }
         if ((active0 & 0x702000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x200000010L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 7;
            return 7;
         }
         if ((active0 & 0x80000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 5;
            }
            return -1;
         }
         if ((active0 & 0x702000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x10L) != 0L)
            return 7;
         if ((active0 & 0x700000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 31;
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
      case 10:
         return jjStopAtPos(0, 46);
      case 32:
         return jjStopAtPos(0, 45);
      case 40:
         return jjStopAtPos(0, 25);
      case 41:
         return jjStopAtPos(0, 26);
      case 58:
         return jjStopAtPos(0, 44);
      case 61:
         return jjStopAtPos(0, 9);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x4200000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x400700000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x40100L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x8000080800L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x1000010000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x5008L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x10000800000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0xe0L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x800022000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x20001000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x410L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
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
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x84200780800L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x41000060100L);
      case 70:
      case 102:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 15, 7);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000040L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x30000815088L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0xa000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x2430L);
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
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000080840L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000040100L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x401000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x702000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0xa000010000L);
      case 80:
      case 112:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(2, 7, 7);
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000410L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0xc0000000000L);
      case 84:
      case 116:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 7);
         else if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(2, 23, 7);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x5008L);
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
         if ((active0 & 0x8L) != 0L)
         {
            jjmatchedKind = 3;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 7);
         return jjMoveStringLiteralDfa4_0(active0, 0x25000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 75:
      case 107:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(3, 6, 7);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 7);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 78:
      case 110:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000010L);
      case 80:
      case 112:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 7);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 7);
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      case 84:
      case 116:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 7);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 7);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 7);
         return jjMoveStringLiteralDfa4_0(active0, 0x30000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000040000L);
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
      case 72:
      case 104:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 7);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 7);
         break;
      case 77:
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 78:
      case 110:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 7);
         return jjMoveStringLiteralDfa5_0(active0, 0x2000080000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x300000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x10L);
      case 83:
      case 115:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 7);
         break;
      case 84:
      case 116:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 7);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 7);
         break;
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
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 31, 7);
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x202010L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x200400000L);
      case 82:
      case 114:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(5, 8, 7);
         break;
      case 84:
      case 116:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 17, 7);
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
         return jjMoveStringLiteralDfa7_0(active0, 0x10L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000L);
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
         return jjMoveStringLiteralDfa8_0(active0, 0x10L);
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
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(7, 31, 7);
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
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(8, 4, 7);
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
   jjnewStateCnt = 7;
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
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(6);
                  }
                  else if (curChar == 32)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjstateSet[jjnewStateCnt++] = 5;
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAdd(2);
                  }
                  break;
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
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(2);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 4:
                  if (curChar != 32)
                     break;
                  kind = 32;
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(6);
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
               case 7:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(6);
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAdd(2);
                  }
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAddStates(0, 3);
                  break;
               case 2:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(2);
                  break;
               case 3:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 5:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAddStates(4, 6);
                  break;
               case 6:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(6);
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
      if ((i = jjnewStateCnt) == (startsAt = 7 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   2, 3, 4, 6, 3, 4, 6, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\75", null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, "\50", 
"\51", null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, "\72", "\40", "\12", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7fffeffffff9L, 
};
static final long[] jjtoSkip = {
   0x6L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[7];
private final int[] jjstateSet = new int[14];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
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
   for (i = 7; i-- > 0;)
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
   if (jjmatchedPos < 0)
   {
      if (image == null)
         curTokenImage = "";
      else
         curTokenImage = image.toString();
      beginLine = endLine = input_stream.getBeginLine();
      beginColumn = endColumn = input_stream.getBeginColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      curTokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
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
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 13 && (0x2200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 32;
   jjmatchedPos = -1;
   curPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
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

int[] jjemptyLineNo = new int[1];
int[] jjemptyColNo = new int[1];
boolean[] jjbeenHere = new boolean[1];
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
         break;
      case 3 :
         break;
      case 4 :
         break;
      case 5 :
         break;
      case 6 :
         break;
      case 7 :
         break;
      case 8 :
         break;
      case 9 :
         break;
      case 10 :
         break;
      case 11 :
         break;
      case 12 :
         break;
      case 13 :
         break;
      case 14 :
         break;
      case 15 :
         break;
      case 16 :
         break;
      case 17 :
         break;
      case 18 :
         break;
      case 19 :
         break;
      case 20 :
         break;
      case 21 :
         break;
      case 22 :
         break;
      case 23 :
         break;
      case 24 :
         break;
      case 25 :
         break;
      case 26 :
         break;
      case 27 :
         break;
      case 29 :
         break;
      case 30 :
         break;
      case 31 :
         break;
      case 32 :
         if (jjmatchedPos == -1)
         {
            if (jjbeenHere[0] &&
                jjemptyLineNo[0] == input_stream.getBeginLine() &&
                jjemptyColNo[0] == input_stream.getBeginColumn())
               throw new TokenMgrError(("Error: Bailing out of infinite loop caused by repeated empty string matches at line " + input_stream.getBeginLine() + ", column " + input_stream.getBeginColumn() + "."), TokenMgrError.LOOP_DETECTED);
            jjemptyLineNo[0] = input_stream.getBeginLine();
            jjemptyColNo[0] = input_stream.getBeginColumn();
            jjbeenHere[0] = true;
         }
         break;
      case 33 :
         break;
      case 34 :
         break;
      case 35 :
         break;
      case 36 :
         break;
      case 37 :
         break;
      case 38 :
         break;
      case 39 :
         break;
      case 40 :
         break;
      case 41 :
         break;
      case 42 :
         break;
      case 43 :
         break;
      case 44 :
         break;
      case 45 :
         break;
      case 46 :
         break;
      default :
         break;
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

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
