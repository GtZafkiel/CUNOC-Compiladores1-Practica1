// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: A_Lexico.jflex

/*---   1era Area: Codigo Usuario   ---*/
//---> Paquetes, importaciones
package org.zafkiel.backend.analizadores;
import org.zafkiel.backend.analizadores.Token;
/*---   2da Area: Opciones y Declaraciones   ---*/

@SuppressWarnings("fallthrough")
public class scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  2,  2,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     4,  0,  0,  0,  0,  0,  0,  0,  5,  6,  7,  8,  9, 10, 11, 12, 
    13, 13, 13, 13, 13, 13, 13, 13, 13, 13,  0,  0,  0,  0,  0,  0, 
     0, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 21, 24, 25, 26, 27, 
    28, 21, 29, 30, 31, 32, 33, 21, 21, 21, 34,  0,  0,  0,  0, 21, 
     0, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 21, 24, 25, 26, 27, 
    28, 21, 29, 30, 31, 32, 33, 21, 21, 21, 34,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  2,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\13\14\1\0\17\14\1\15"+
    "\23\14\1\16\1\14\1\17\11\14\1\20\7\14\1\21"+
    "\1\14\1\22\1\14\1\23\3\14\1\24\1\14\1\25"+
    "\1\26\3\14\1\27\2\14\1\30\1\14\1\31\4\14"+
    "\1\32\1\33\1\34\1\35\2\14\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[112];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\43\0\43\0\106\0\43\0\43\0\43\0\43"+
    "\0\43\0\43\0\151\0\43\0\214\0\257\0\322\0\365"+
    "\0\u0118\0\u013b\0\u015e\0\u0181\0\u01a4\0\u01c7\0\u01ea\0\u020d"+
    "\0\u0230\0\u0253\0\u0276\0\u0299\0\u02bc\0\u02df\0\u0302\0\u0325"+
    "\0\u0348\0\u036b\0\u038e\0\u03b1\0\u03d4\0\u03f7\0\u041a\0\u043d"+
    "\0\u0230\0\u0460\0\u0483\0\u04a6\0\u04c9\0\u04ec\0\u050f\0\u0532"+
    "\0\u0555\0\u0578\0\u059b\0\u05be\0\u05e1\0\u0604\0\u0627\0\u064a"+
    "\0\u066d\0\u0690\0\u06b3\0\u06d6\0\u0118\0\u06f9\0\u0118\0\u071c"+
    "\0\u073f\0\u0762\0\u0785\0\u07a8\0\u07cb\0\u07ee\0\u0811\0\u0834"+
    "\0\u0118\0\u0857\0\u087a\0\u089d\0\u08c0\0\u08e3\0\u0906\0\u0929"+
    "\0\u0118\0\u094c\0\u0118\0\u096f\0\u0118\0\u0992\0\u09b5\0\u09d8"+
    "\0\u0118\0\u09fb\0\u0118\0\u0118\0\u0a1e\0\u0a41\0\u0a64\0\u0118"+
    "\0\u0a87\0\u0aaa\0\u0118\0\u0acd\0\u0118\0\u0af0\0\u0b13\0\u0b36"+
    "\0\u0b59\0\u0118\0\u0118\0\u0118\0\u0118\0\u0b7c\0\u0b9f\0\u0118";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[112];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\2\1\14\1\15\1\16\1\17"+
    "\1\20\3\21\1\22\3\21\1\23\1\24\1\25\1\21"+
    "\1\26\1\27\3\21\1\30\1\21\44\0\1\3\56\0"+
    "\1\15\40\0\1\31\1\0\1\15\42\0\14\21\1\32"+
    "\1\33\7\21\1\34\15\0\13\21\1\35\12\21\15\0"+
    "\1\21\1\36\7\21\1\37\11\21\1\40\2\21\15\0"+
    "\26\21\15\0\20\21\1\41\5\21\15\0\11\21\1\42"+
    "\14\21\15\0\16\21\1\43\7\21\15\0\5\21\1\44"+
    "\20\21\15\0\16\21\1\45\7\21\15\0\5\21\1\46"+
    "\10\21\1\47\7\21\15\0\5\21\1\50\20\21\15\0"+
    "\1\51\42\0\1\21\1\52\24\21\15\0\11\21\1\53"+
    "\14\21\15\0\23\21\1\54\2\21\15\0\1\21\1\55"+
    "\24\21\15\0\6\21\1\56\17\21\15\0\20\21\1\57"+
    "\5\21\15\0\1\21\1\60\16\21\1\61\5\21\15\0"+
    "\1\21\1\62\24\21\15\0\15\21\1\63\10\21\15\0"+
    "\20\21\1\64\5\21\15\0\7\21\1\65\16\21\15\0"+
    "\13\21\1\66\12\21\15\0\3\21\1\67\22\21\15\0"+
    "\12\21\1\70\6\21\1\71\4\21\15\0\20\21\1\72"+
    "\5\21\15\0\20\21\1\73\5\21\15\0\14\21\1\74"+
    "\11\21\15\0\13\21\1\75\12\21\15\0\15\21\1\76"+
    "\10\21\15\0\5\21\1\77\20\21\15\0\3\21\1\100"+
    "\22\21\15\0\4\21\1\101\21\21\15\0\24\21\1\102"+
    "\1\21\15\0\6\21\1\103\17\21\15\0\5\21\1\104"+
    "\20\21\15\0\1\21\1\105\24\21\15\0\20\21\1\106"+
    "\5\21\15\0\11\21\1\107\14\21\15\0\22\21\1\110"+
    "\3\21\15\0\16\21\1\111\7\21\15\0\1\21\1\112"+
    "\24\21\15\0\4\21\1\113\21\21\15\0\11\21\1\114"+
    "\14\21\15\0\1\21\1\115\24\21\15\0\3\21\1\116"+
    "\22\21\15\0\23\21\1\117\2\21\15\0\20\21\1\120"+
    "\5\21\15\0\1\21\1\121\24\21\15\0\11\21\1\122"+
    "\14\21\15\0\1\21\1\123\24\21\15\0\4\21\1\124"+
    "\21\21\15\0\16\21\1\125\7\21\15\0\7\21\1\126"+
    "\16\21\15\0\1\21\1\127\24\21\15\0\4\21\1\130"+
    "\21\21\15\0\5\21\1\131\20\21\15\0\13\21\1\132"+
    "\12\21\15\0\20\21\1\133\5\21\15\0\16\21\1\134"+
    "\7\21\15\0\13\21\1\135\12\21\15\0\1\21\1\136"+
    "\24\21\15\0\3\21\1\137\22\21\15\0\16\21\1\140"+
    "\7\21\15\0\16\21\1\141\7\21\15\0\15\21\1\142"+
    "\10\21\15\0\16\21\1\143\7\21\15\0\13\21\1\144"+
    "\12\21\15\0\16\21\1\145\7\21\15\0\4\21\1\146"+
    "\21\21\15\0\1\21\1\147\24\21\15\0\15\21\1\150"+
    "\10\21\15\0\7\21\1\151\16\21\15\0\16\21\1\152"+
    "\7\21\15\0\16\21\1\153\7\21\15\0\20\21\1\154"+
    "\5\21\15\0\16\21\1\155\7\21\15\0\23\21\1\156"+
    "\2\21\15\0\13\21\1\157\12\21\15\0\16\21\1\160"+
    "\7\21";

  private static int [] zzUnpacktrans() {
    int [] result = new int[3010];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\1\6\11\1\1\1\11\14\1\1\0"+
    "\127\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[112];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    private int counter;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public scanner(java.io.Reader in) {
      counter = 0;
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    return ZZ_CMAP[input];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { counter++;
    return new Token(counter, yytext(), "ERROR", yyline, yycolumn, yychar);
            }
          // fall through
          case 31: break;
          case 2:
            { //---> Ignorar saltos de linea
            }
          // fall through
          case 32: break;
          case 3:
            { //---> Ignorar espacios en blanco
            }
          // fall through
          case 33: break;
          case 4:
            { counter++;
    return new Token(counter, yytext(), "Parentesis_Abierto", yyline, yycolumn, yychar);
            }
          // fall through
          case 34: break;
          case 5:
            { counter++;
    return new Token(counter, yytext(), "Parentesis_Cerrado", yyline, yycolumn, yychar);
            }
          // fall through
          case 35: break;
          case 6:
            { counter++;
    return new Token(counter, yytext(), "Multiplicador", yyline, yycolumn, yychar);
            }
          // fall through
          case 36: break;
          case 7:
            { counter++;
    return new Token(counter, yytext(), "Mas", yyline, yycolumn, yychar);
            }
          // fall through
          case 37: break;
          case 8:
            { counter++;
    return new Token(counter, yytext(), "Coma", yyline, yycolumn, yychar);
            }
          // fall through
          case 38: break;
          case 9:
            { counter++;
    return new Token(counter, yytext(), "Menos", yyline, yycolumn, yychar);
            }
          // fall through
          case 39: break;
          case 10:
            { counter++;
    return new Token(counter, yytext(), "Divisor", yyline, yycolumn, yychar);
            }
          // fall through
          case 40: break;
          case 11:
            { counter++;
    return new Token(counter, yytext(), "Entero", yyline, yycolumn, yychar);
            }
          // fall through
          case 41: break;
          case 12:
            { counter++;
    return new Token(counter, yytext(), "Identificador", yyline, yycolumn, yychar);
            }
          // fall through
          case 42: break;
          case 13:
            { counter++;
    return new Token(counter, yytext(), "Decimal", yyline, yycolumn, yychar);
            }
          // fall through
          case 43: break;
          case 14:
            { counter++;
    return new Token(counter, yytext(), "Azul", yyline, yycolumn, yychar);
            }
          // fall through
          case 44: break;
          case 15:
            { counter++;
    return new Token(counter, yytext(), "Cafe", yyline, yycolumn, yychar);
            }
          // fall through
          case 45: break;
          case 16:
            { counter++;
    return new Token(counter, yytext(), "Rojo", yyline, yycolumn, yychar);
            }
          // fall through
          case 46: break;
          case 17:
            { counter++;
    return new Token(counter, yytext(), "Curva", yyline, yycolumn, yychar);
            }
          // fall through
          case 47: break;
          case 18:
            { counter++;
    return new Token(counter, yytext(), "Linea", yyline, yycolumn, yychar);
            }
          // fall through
          case 48: break;
          case 19:
            { counter++;
    return new Token(counter, yytext(), "Negro", yyline, yycolumn, yychar);
            }
          // fall through
          case 49: break;
          case 20:
            { counter++;
    return new Token(counter, yytext(), "Verde", yyline, yycolumn, yychar);
            }
          // fall through
          case 50: break;
          case 21:
            { counter++;
    return new Token(counter, yytext(), "Animar", yyline, yycolumn, yychar);
            }
          // fall through
          case 51: break;
          case 22:
            { counter++;
    return new Token(counter, yytext(), "Blanco", yyline, yycolumn, yychar);
            }
          // fall through
          case 52: break;
          case 23:
            { counter++;
    return new Token(counter, yytext(), "Morado", yyline, yycolumn, yychar);
            }
          // fall through
          case 53: break;
          case 24:
            { counter++;
    return new Token(counter, yytext(), "Rosado", yyline, yycolumn, yychar);
            }
          // fall through
          case 54: break;
          case 25:
            { counter++;
    return new Token(counter, yytext(), "Circulo", yyline, yycolumn, yychar);
            }
          // fall through
          case 55: break;
          case 26:
            { counter++;
    return new Token(counter, yytext(), "Amarillo", yyline, yycolumn, yychar);
            }
          // fall through
          case 56: break;
          case 27:
            { counter++;
    return new Token(counter, yytext(), "Cuadrado", yyline, yycolumn, yychar);
            }
          // fall through
          case 57: break;
          case 28:
            { counter++;
    return new Token(counter, yytext(), "Graficar", yyline, yycolumn, yychar);
            }
          // fall through
          case 58: break;
          case 29:
            { counter++;
    return new Token(counter, yytext(), "Poligono", yyline, yycolumn, yychar);
            }
          // fall through
          case 59: break;
          case 30:
            { counter++;
    return new Token(counter, yytext(), "Rectangulo", yyline, yycolumn, yychar);
            }
          // fall through
          case 60: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
