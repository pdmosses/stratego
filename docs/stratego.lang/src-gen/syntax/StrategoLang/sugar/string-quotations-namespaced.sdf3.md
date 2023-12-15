---
title: string-quotations-namespaced.sdf3
hide:
  - toc
---

# `string-quotations-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/string-quotations-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/string-quotations-namespaced.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/sugar/string-quotations-namespaced_1_8" title="Multi-file references" data-urls="../constants-namespaced.sdf3/#StrategoLang/sugar/string-quotations-namespaced_6_3 line 6; ../../deduplicated-namespaced.sdf3/#StrategoLang/sugar/string-quotations-namespaced_11_3 line 11">StrategoLang/sugar/string-quotations-namespaced</button>

<span class="keyword">imports</span>
  <a href="../../core/terms-namespaced.sdf3/#StrategoLang/core/terms-namespaced_1_8" id="StrategoLang/core/terms-namespaced_4_3" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>

<span class="keyword">sorts</span> <a href="#StrategoLang-StringQuotation_10_26" id="StrategoLang-StringQuotation_6_7" title="Referenced at line 10">StrategoLang-StringQuotation</a> <a href="#StrategoLang-StringQuotedPart1_54_62" id="StrategoLang-StringQuotedPart1_6_36" title="Referenced at line 54">StrategoLang-StringQuotedPart1</a> <a href="#StrategoLang-StringQuotedPart2_55_62" id="StrategoLang-StringQuotedPart2_6_67" title="Referenced at line 55">StrategoLang-StringQuotedPart2</a> <a href="#StrategoLang-StringQuotedPart3_56_62" id="StrategoLang-StringQuotedPart3_6_98" title="Referenced at line 56">StrategoLang-StringQuotedPart3</a> <a href="#StrategoLang-StringQuotedPart4_57_62" id="StrategoLang-StringQuotedPart4_6_129" title="Referenced at line 57">StrategoLang-StringQuotedPart4</a>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-PreTerm_10_3" title="Not referenced">StrategoLang-PreTerm</span> = <a href="#StrategoLang-StringQuotation_6_7" id="StrategoLang-StringQuotation_10_26" title="Defined at line 6, 54, 55, 56, 57">StrategoLang-StringQuotation</a> { }
  <a href="#StrategoLang-StringQuotedPart1_54_62" id="StrategoLang-StringQuotedPart1_11_3" title="Referenced at line 54">StrategoLang-StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QStr1_11_34" title="Not referenced">QStr1</span></span> = <a href="#StrategoLang-StringQuotedChars1_28_3" id="StrategoLang-StringQuotedChars1_11_42" title="Defined at line 28">StrategoLang-StringQuotedChars1</a> { }
  <a href="#StrategoLang-StringQuotedPart2_55_62" id="StrategoLang-StringQuotedPart2_12_3" title="Referenced at line 55">StrategoLang-StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QStr2_12_34" title="Not referenced">QStr2</span></span> = <a href="#StrategoLang-StringQuotedChars2_29_3" id="StrategoLang-StringQuotedChars2_12_42" title="Defined at line 29">StrategoLang-StringQuotedChars2</a> { }
  <a href="#StrategoLang-StringQuotedPart3_56_62" id="StrategoLang-StringQuotedPart3_13_3" title="Referenced at line 56">StrategoLang-StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QStr3_13_34" title="Not referenced">QStr3</span></span> = <a href="#StrategoLang-StringQuotedChars3_30_3" id="StrategoLang-StringQuotedChars3_13_42" title="Defined at line 30">StrategoLang-StringQuotedChars3</a> { }
  <a href="#StrategoLang-StringQuotedPart4_57_62" id="StrategoLang-StringQuotedPart4_14_3" title="Referenced at line 57">StrategoLang-StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QStr4_14_34" title="Not referenced">QStr4</span></span> = <a href="#StrategoLang-StringQuotedChars4_31_3" id="StrategoLang-StringQuotedChars4_14_42" title="Defined at line 31">StrategoLang-StringQuotedChars4</a> { }
  <a href="#StrategoLang-StringQuotedPart1_54_62" id="StrategoLang-StringQuotedPart1_15_3" title="Referenced at line 54">StrategoLang-StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QDollar1_15_34" title="Not referenced">QDollar1</span></span> = <a href="#StrategoLang-Dollar1_32_3" id="StrategoLang-Dollar1_15_45" title="Defined at line 32">StrategoLang-Dollar1</a> { }
  <a href="#StrategoLang-StringQuotedPart2_55_62" id="StrategoLang-StringQuotedPart2_16_3" title="Referenced at line 55">StrategoLang-StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QDollar2_16_34" title="Not referenced">QDollar2</span></span> = <a href="#StrategoLang-Dollar2_33_3" id="StrategoLang-Dollar2_16_45" title="Defined at line 33">StrategoLang-Dollar2</a> { }
  <a href="#StrategoLang-StringQuotedPart3_56_62" id="StrategoLang-StringQuotedPart3_17_3" title="Referenced at line 56">StrategoLang-StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QDollar3_17_34" title="Not referenced">QDollar3</span></span> = <a href="#StrategoLang-Dollar3_34_3" id="StrategoLang-Dollar3_17_45" title="Defined at line 34">StrategoLang-Dollar3</a> { }
  <a href="#StrategoLang-StringQuotedPart4_57_62" id="StrategoLang-StringQuotedPart4_18_3" title="Referenced at line 57">StrategoLang-StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QDollar4_18_34" title="Not referenced">QDollar4</span></span> = <a href="#StrategoLang-Dollar4_35_3" id="StrategoLang-Dollar4_18_45" title="Defined at line 35">StrategoLang-Dollar4</a> { }
  <a href="#StrategoLang-StringQuotedPart1_54_62" id="StrategoLang-StringQuotedPart1_19_3" title="Referenced at line 54">StrategoLang-StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QBr1_19_34" title="Not referenced">QBr1</span></span> = <a href="#StrategoLang-QuotedBracket1_36_3" id="StrategoLang-QuotedBracket1_19_41" title="Defined at line 36">StrategoLang-QuotedBracket1</a> { }
  <a href="#StrategoLang-StringQuotedPart2_55_62" id="StrategoLang-StringQuotedPart2_20_3" title="Referenced at line 55">StrategoLang-StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QBr2_20_34" title="Not referenced">QBr2</span></span> = <a href="#StrategoLang-QuotedBracket2_37_3" id="StrategoLang-QuotedBracket2_20_41" title="Defined at line 37">StrategoLang-QuotedBracket2</a> { }
  <a href="#StrategoLang-StringQuotedPart3_56_62" id="StrategoLang-StringQuotedPart3_21_3" title="Referenced at line 56">StrategoLang-StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QBr3_21_34" title="Not referenced">QBr3</span></span> = <a href="#StrategoLang-QuotedBracket3_38_3" id="StrategoLang-QuotedBracket3_21_41" title="Defined at line 38">StrategoLang-QuotedBracket3</a> { }
  <a href="#StrategoLang-StringQuotedPart4_57_62" id="StrategoLang-StringQuotedPart4_22_3" title="Referenced at line 57">StrategoLang-StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QBr4_22_34" title="Not referenced">QBr4</span></span> = <a href="#StrategoLang-QuotedBracket4_39_3" id="StrategoLang-QuotedBracket4_22_41" title="Defined at line 39">StrategoLang-QuotedBracket4</a> { }

<span class="keyword">sorts</span> <span id="StringQuotedChars1_24_7" title="Not referenced">StringQuotedChars1</span><span class="keyword">-LEX</span> <span id="Dollar1_24_30" title="Not referenced">Dollar1</span><span class="keyword">-LEX</span> <span id="QuotedBracket1_24_42" title="Not referenced">QuotedBracket1</span><span class="keyword">-LEX</span> <span id="StringQuotedChars2_24_61" title="Not referenced">StringQuotedChars2</span><span class="keyword">-LEX</span> <span id="Dollar2_24_84" title="Not referenced">Dollar2</span><span class="keyword">-LEX</span> <span id="QuotedBracket2_24_96" title="Not referenced">QuotedBracket2</span><span class="keyword">-LEX</span> <span id="StringQuotedChars3_24_115" title="Not referenced">StringQuotedChars3</span><span class="keyword">-LEX</span> <span id="Dollar3_24_138" title="Not referenced">Dollar3</span><span class="keyword">-LEX</span> <span id="QuotedBracket3_24_150" title="Not referenced">QuotedBracket3</span><span class="keyword">-LEX</span> <span id="StringQuotedChars4_24_169" title="Not referenced">StringQuotedChars4</span><span class="keyword">-LEX</span> <span id="Dollar4_24_192" title="Not referenced">Dollar4</span><span class="keyword">-LEX</span> <span id="QuotedBracket4_24_204" title="Not referenced">QuotedBracket4</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-StringQuotedChars1_11_42" id="StrategoLang-StringQuotedChars1_28_3" title="Referenced at line 11, 43">StrategoLang-StringQuotedChars1</a> = ~[\[\]\$]+ { }
  <a href="#StrategoLang-StringQuotedChars2_12_42" id="StrategoLang-StringQuotedChars2_29_3" title="Referenced at line 12, 44">StrategoLang-StringQuotedChars2</a> = ~[\{\}\$]+ { }
  <a href="#StrategoLang-StringQuotedChars3_13_42" id="StrategoLang-StringQuotedChars3_30_3" title="Referenced at line 13, 45">StrategoLang-StringQuotedChars3</a> = ~[\(\)\$]+ { }
  <a href="#StrategoLang-StringQuotedChars4_14_42" id="StrategoLang-StringQuotedChars4_31_3" title="Referenced at line 14, 46">StrategoLang-StringQuotedChars4</a> = ~[\&lt;\&gt;\$]+ { }
  <a href="#StrategoLang-Dollar1_15_45" id="StrategoLang-Dollar1_32_3" title="Referenced at line 15, 47">StrategoLang-Dollar1</a> = <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-Dollar2_16_45" id="StrategoLang-Dollar2_33_3" title="Referenced at line 16, 48">StrategoLang-Dollar2</a> = <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-Dollar3_17_45" id="StrategoLang-Dollar3_34_3" title="Referenced at line 17, 49">StrategoLang-Dollar3</a> = <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-Dollar4_18_45" id="StrategoLang-Dollar4_35_3" title="Referenced at line 18, 50">StrategoLang-Dollar4</a> = <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-QuotedBracket1_19_41" id="StrategoLang-QuotedBracket1_36_3" title="Referenced at line 19">StrategoLang-QuotedBracket1</a> = <span class="cons_Lit">"$"</span> [\[\]] <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-QuotedBracket2_20_41" id="StrategoLang-QuotedBracket2_37_3" title="Referenced at line 20">StrategoLang-QuotedBracket2</a> = <span class="cons_Lit">"$"</span> [\{\}] <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-QuotedBracket3_21_41" id="StrategoLang-QuotedBracket3_38_3" title="Referenced at line 21">StrategoLang-QuotedBracket3</a> = <span class="cons_Lit">"$"</span> [\(\)] <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-QuotedBracket4_22_41" id="StrategoLang-QuotedBracket4_39_3" title="Referenced at line 22">StrategoLang-QuotedBracket4</a> = <span class="cons_Lit">"$"</span> [\&lt;\&gt;] <span class="cons_Lit">"$"</span> { }

<span class="keyword">lexical restrictions</span>

  <a href="#StrategoLang-StringQuotedChars1_28_3" id="StrategoLang-StringQuotedChars1_43_3" title="Defined at line 28">StrategoLang-StringQuotedChars1</a> -/- ~[\[\]\$]
  <a href="#StrategoLang-StringQuotedChars2_29_3" id="StrategoLang-StringQuotedChars2_44_3" title="Defined at line 29">StrategoLang-StringQuotedChars2</a> -/- ~[\{\}\$]
  <a href="#StrategoLang-StringQuotedChars3_30_3" id="StrategoLang-StringQuotedChars3_45_3" title="Defined at line 30">StrategoLang-StringQuotedChars3</a> -/- ~[\(\)\$]
  <a href="#StrategoLang-StringQuotedChars4_31_3" id="StrategoLang-StringQuotedChars4_46_3" title="Defined at line 31">StrategoLang-StringQuotedChars4</a> -/- ~[\&lt;\&gt;\$]
  <a href="#StrategoLang-Dollar1_32_3" id="StrategoLang-Dollar1_47_3" title="Defined at line 32">StrategoLang-Dollar1</a> -/- [\[\]].[\$]
  <a href="#StrategoLang-Dollar2_33_3" id="StrategoLang-Dollar2_48_3" title="Defined at line 33">StrategoLang-Dollar2</a> -/- [\{\}].[\$]
  <a href="#StrategoLang-Dollar3_34_3" id="StrategoLang-Dollar3_49_3" title="Defined at line 34">StrategoLang-Dollar3</a> -/- [\(\)].[\$]
  <a href="#StrategoLang-Dollar4_35_3" id="StrategoLang-Dollar4_50_3" title="Defined at line 35">StrategoLang-Dollar4</a> -/- [\&lt;\&gt;].[\$]

<span class="keyword">syntax</span>

  <a href="#StrategoLang-StringQuotation_10_26" id="StrategoLang-StringQuotation_54_3" title="Referenced at line 10">StrategoLang-StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation1_54_35" title="Not referenced">StringQuotation1</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"["</span> <a href="#StrategoLang-StringQuotedPart1_6_36" id="StrategoLang-StringQuotedPart1_54_62" title="Defined at line 6, 11, 15, 19, 58">StrategoLang-StringQuotedPart1</a><span class="keyword">-CF</span>* <span class="cons_Lit">"]"</span> { }
  <a href="#StrategoLang-StringQuotation_10_26" id="StrategoLang-StringQuotation_55_3" title="Referenced at line 10">StrategoLang-StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation2_55_35" title="Not referenced">StringQuotation2</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"{"</span> <a href="#StrategoLang-StringQuotedPart2_6_67" id="StrategoLang-StringQuotedPart2_55_62" title="Defined at line 6, 12, 16, 20, 59">StrategoLang-StringQuotedPart2</a><span class="keyword">-CF</span>* <span class="cons_Lit">"}"</span> { }
  <a href="#StrategoLang-StringQuotation_10_26" id="StrategoLang-StringQuotation_56_3" title="Referenced at line 10">StrategoLang-StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation3_56_35" title="Not referenced">StringQuotation3</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"("</span> <a href="#StrategoLang-StringQuotedPart3_6_98" id="StrategoLang-StringQuotedPart3_56_62" title="Defined at line 6, 13, 17, 21, 60">StrategoLang-StringQuotedPart3</a><span class="keyword">-CF</span>* <span class="cons_Lit">")"</span> { }
  <a href="#StrategoLang-StringQuotation_10_26" id="StrategoLang-StringQuotation_57_3" title="Referenced at line 10">StrategoLang-StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation4_57_35" title="Not referenced">StringQuotation4</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"&lt;"</span> <a href="#StrategoLang-StringQuotedPart4_6_129" id="StrategoLang-StringQuotedPart4_57_62" title="Defined at line 6, 14, 18, 22, 61">StrategoLang-StringQuotedPart4</a><span class="keyword">-CF</span>* <span class="cons_Lit">"&gt;"</span> { }
  <a href="#StrategoLang-StringQuotedPart1_54_62" id="StrategoLang-StringQuotedPart1_58_3" title="Referenced at line 54">StrategoLang-StringQuotedPart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape1_58_37" title="Not referenced">StringEscape1</span></span> = <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_58_68" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span> { }
  <a href="#StrategoLang-StringQuotedPart2_55_62" id="StrategoLang-StringQuotedPart2_59_3" title="Referenced at line 55">StrategoLang-StringQuotedPart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape2_59_37" title="Not referenced">StringEscape2</span></span> = <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_59_68" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span> { }
  <a href="#StrategoLang-StringQuotedPart3_56_62" id="StrategoLang-StringQuotedPart3_60_3" title="Referenced at line 56">StrategoLang-StringQuotedPart3</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape3_60_37" title="Not referenced">StringEscape3</span></span> = <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_60_68" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span> { }
  <a href="#StrategoLang-StringQuotedPart4_57_62" id="StrategoLang-StringQuotedPart4_61_3" title="Referenced at line 57">StrategoLang-StringQuotedPart4</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape4_61_37" title="Not referenced">StringEscape4</span></span> = <span class="cons_Lit">"&lt;"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_61_68" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"&gt;"</span> { }

<span class="keyword">sorts</span> <span id="StrategoLang-InternalStringQuotation_63_7" title="Not referenced">StrategoLang-InternalStringQuotation</span> <a href="#StrategoLang-InternalStringQuotedPart1_67_95" id="StrategoLang-InternalStringQuotedPart1_63_44" title="Referenced at line 67">StrategoLang-InternalStringQuotedPart1</a> <a href="#StrategoLang-InternalStringQuotedPart2_68_95" id="StrategoLang-InternalStringQuotedPart2_63_83" title="Referenced at line 68">StrategoLang-InternalStringQuotedPart2</a> <a href="#StrategoLang-InternalStringQuotedPart3_69_95" id="StrategoLang-InternalStringQuotedPart3_63_122" title="Referenced at line 69">StrategoLang-InternalStringQuotedPart3</a> <a href="#StrategoLang-InternalStringQuotedPart4_70_95" id="StrategoLang-InternalStringQuotedPart4_63_161" title="Referenced at line 70">StrategoLang-InternalStringQuotedPart4</a>

<span class="keyword">syntax</span>

  <span id="StrategoLang-InternalStringQuotation_67_3" title="Not referenced">StrategoLang-InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation1_67_43" title="Not referenced">StringQuotation1</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"["</span> <a href="#StrategoLang-Padding_80_3" id="StrategoLang-Padding_67_70" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <a href="#StrategoLang-InternalStringQuotedPart1_63_44" id="StrategoLang-InternalStringQuotedPart1_67_95" title="Defined at line 63, 71">StrategoLang-InternalStringQuotedPart1</a><span class="keyword">-CF</span>* <span class="cons_Lit">"]"</span> { }
  <span id="StrategoLang-InternalStringQuotation_68_3" title="Not referenced">StrategoLang-InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation2_68_43" title="Not referenced">StringQuotation2</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"{"</span> <a href="#StrategoLang-Padding_80_3" id="StrategoLang-Padding_68_70" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <a href="#StrategoLang-InternalStringQuotedPart2_63_83" id="StrategoLang-InternalStringQuotedPart2_68_95" title="Defined at line 63, 72">StrategoLang-InternalStringQuotedPart2</a><span class="keyword">-CF</span>* <span class="cons_Lit">"}"</span> { }
  <span id="StrategoLang-InternalStringQuotation_69_3" title="Not referenced">StrategoLang-InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation3_69_43" title="Not referenced">StringQuotation3</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"("</span> <a href="#StrategoLang-Padding_80_3" id="StrategoLang-Padding_69_70" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <a href="#StrategoLang-InternalStringQuotedPart3_63_122" id="StrategoLang-InternalStringQuotedPart3_69_95" title="Defined at line 63, 73">StrategoLang-InternalStringQuotedPart3</a><span class="keyword">-CF</span>* <span class="cons_Lit">")"</span> { }
  <span id="StrategoLang-InternalStringQuotation_70_3" title="Not referenced">StrategoLang-InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation4_70_43" title="Not referenced">StringQuotation4</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"&lt;"</span> <a href="#StrategoLang-Padding_80_3" id="StrategoLang-Padding_70_70" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <a href="#StrategoLang-InternalStringQuotedPart4_63_161" id="StrategoLang-InternalStringQuotedPart4_70_95" title="Defined at line 63, 74">StrategoLang-InternalStringQuotedPart4</a><span class="keyword">-CF</span>* <span class="cons_Lit">"&gt;"</span> { }
  <a href="#StrategoLang-InternalStringQuotedPart1_67_95" id="StrategoLang-InternalStringQuotedPart1_71_3" title="Referenced at line 67">StrategoLang-InternalStringQuotedPart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape1_71_45" title="Not referenced">StringEscape1</span></span> = <a href="#StrategoLang-Padding_80_3" id="StrategoLang-Padding_71_61" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_71_101" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span> { }
  <a href="#StrategoLang-InternalStringQuotedPart2_68_95" id="StrategoLang-InternalStringQuotedPart2_72_3" title="Referenced at line 68">StrategoLang-InternalStringQuotedPart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape2_72_45" title="Not referenced">StringEscape2</span></span> = <a href="#StrategoLang-Padding_80_3" id="StrategoLang-Padding_72_61" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_72_101" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span> { }
  <a href="#StrategoLang-InternalStringQuotedPart3_69_95" id="StrategoLang-InternalStringQuotedPart3_73_3" title="Referenced at line 69">StrategoLang-InternalStringQuotedPart3</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape3_73_45" title="Not referenced">StringEscape3</span></span> = <a href="#StrategoLang-Padding_80_3" id="StrategoLang-Padding_73_61" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_73_101" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span> { }
  <a href="#StrategoLang-InternalStringQuotedPart4_70_95" id="StrategoLang-InternalStringQuotedPart4_74_3" title="Referenced at line 70">StrategoLang-InternalStringQuotedPart4</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape4_74_45" title="Not referenced">StringEscape4</span></span> = <a href="#StrategoLang-Padding_80_3" id="StrategoLang-Padding_74_61" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"&lt;"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_74_101" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"&gt;"</span> { }

<span class="keyword">sorts</span> <span id="Padding_76_7" title="Not referenced">Padding</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-Padding_67_70" id="StrategoLang-Padding_80_3" title="Referenced at line 67, 68, 69, 70, 71, 72, 73, 74">StrategoLang-Padding</a> = <span class="cons_CiLit">' '</span>+ { }

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
