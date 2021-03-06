����   4 �
 	 C	 D E F
 G H I J
  K L M
  N
  O
 P Q
 G R	 S T U
 V W
  X
 V Y	 S Z [ \	 S ] ^
  _
  ` a b
  c d e f
 g h
 i j k <init> ()V Code LineNumberTable LocalVariableTable this  LCrownAndAnchor/Bug2Replication; testBug2 result I balance 
expBalance bet player LCrownAndAnchor/Player; pick LCrownAndAnchor/DiceValue; d1 LCrownAndAnchor/Dice; d2 d3 instance LCrownAndAnchor/Game; StackMapTable k I l U ^ RuntimeVisibleAnnotations Lorg/junit/Test; 
SourceFile Bug2Replication.java " # m n o 
Bug 2 Test p q r CrownAndAnchor/Player Fred " s %s's balance is %d

 java/lang/Object t u v w x y z { | l } 2 CrownAndAnchor/Dice ~  � � � � � � 2 � � � � 2 CrownAndAnchor/Game " � � � %s bet %d on %s
 Rolled %s, %s, %s
 � � %s won %d, balance now %d

 %s lost, balance now %d

 %s now has balance %d
 � � � � � � CrownAndAnchor/Bug2Replication CrownAndAnchor/DiceValue java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println (Ljava/lang/String;)V (Ljava/lang/String;I)V getName ()Ljava/lang/String; 
getBalance ()I java/lang/Integer valueOf (I)Ljava/lang/Integer; printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; CROWN org/mockito/Mockito mock %(Ljava/lang/Class;)Ljava/lang/Object; getValue ()LCrownAndAnchor/DiceValue; when :(Ljava/lang/Object;)Lorg/mockito/stubbing/OngoingStubbing; ANCHOR $org/mockito/stubbing/OngoingStubbing 
thenReturn HEART B(LCrownAndAnchor/Dice;LCrownAndAnchor/Dice;LCrownAndAnchor/Dice;)V balanceExceedsLimitBy (I)Z 	playRound 5(LCrownAndAnchor/Player;LCrownAndAnchor/DiceValue;I)I java/lang/String format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; org/junit/Assert assertEquals (JJ)V ! ! 	       " #  $   3     *� �    %   
       &        ' (    ) #  $  �    �� � d<=>� Y� :� � 	Y� 
SY� � S� W� :� � :� � � �  W� � :� � � �  W� � :� � � �  W� Y� :	� � ��  Ȣ �� � 	Y� 
SY� SYS� W� � 	Y� SY� SY� S� W	� 6

� .� � 	Y� 
SY
� SY� � S� W� #� � 	Y� 
SY� � S� W��J� � 	Y� 
SY� � S� � �� ��  �    %   � #              ! ( " 7 ! ; # @ & J ' [ ) e * v , � - � / � 1 � 2 � 3 � 2 � 5 � 6 � 5 � 8 : ; </ ;6 >C ?R >V AY B{ C� D &   p  P * + 
  � ' (   | , +  z - +  x . +  l / 0  @G 1 2  J= 3 4  e" 5 4  � 6 4  � � 7 8 	 9   ) � � 
 : ; < = = = >  � ��  ?     @    A    B