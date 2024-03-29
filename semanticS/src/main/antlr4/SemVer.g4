grammar SemVer;

// top ---------------------------------------------

compilationUnit : version_core
                | version_core '-' pre_release
                | version_core '+' build
                | version_core '-' pre_release '+' build
                ;

// core ------------------------------------------------

version_core : major '.' minor '.' patch ;

major : numeric_id ;
minor : numeric_id ;
patch : numeric_id ;

// pre release -----------------------------------------

pre_release : dot_sep_pre_release ;

dot_sep_pre_release : pre_release_id
                    | pre_release_id '.' dot_sep_pre_release
                    ;

pre_release_id : anum_id ;

// build -------------------------------------------------

build : build_id ;

build_id : anum_id ;

// -----------------

anum_id : anum+ ;
numeric_id : zero | nonzero number* ;

number : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ;
nonzero : '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ;
anum : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
     | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J'
     | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T'
     | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z'
     | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l'
     | 'm' | 'n' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z'
     | '-'
     ;
zero : '0' ;


