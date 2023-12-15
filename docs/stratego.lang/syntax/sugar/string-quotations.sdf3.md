---
title: string-quotations.sdf3
hide:
  - toc
---

# `string-quotations.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/sugar/string-quotations.sdf3]

[pdmosses/stratego/stratego.lang/syntax/sugar/string-quotations.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/sugar/string-quotations.sdf3 "The source file on GitHub"

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
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="sugar/string-quotations_1_8" title="Multi-file references" data-urls="../constants.sdf3/#sugar/string-quotations_6_3 line 6; ../../deduplicated.sdf3/#sugar/string-quotations_12_3 line 12">sugar/string-quotations</button>

<span class="keyword">imports</span> <a href="../../core/terms.sdf3/#core/terms_1_8" id="core/terms_3_9" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>

<span class="keyword">context-free sorts</span>
  <a href="#StringQuotation_13_13" id="StringQuotation_6_3" title="Referenced at line 13">StringQuotation</a>
  <a href="#StringQuotedPart1_64_49" id="StringQuotedPart1_7_3" title="Referenced at line 64">StringQuotedPart1</a>
  <a href="#StringQuotedPart2_65_49" id="StringQuotedPart2_8_3" title="Referenced at line 65">StringQuotedPart2</a>
  <a href="#StringQuotedPart3_66_49" id="StringQuotedPart3_9_3" title="Referenced at line 66">StringQuotedPart3</a>
  <a href="#StringQuotedPart4_67_49" id="StringQuotedPart4_10_3" title="Referenced at line 67">StringQuotedPart4</a>

<span class="keyword">context-free syntax</span>
  <span id="PreTerm_13_3" title="Not referenced">PreTerm</span> = <a href="#StringQuotation_6_3" id="StringQuotation_13_13" title="Defined at line 6, 64, 65, 66, 67">StringQuotation</a>

  <a href="#StringQuotedPart1_64_49" id="StringQuotedPart1_15_3" title="Referenced at line 64">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QStr1_15_21" title="Not referenced">QStr1</span></span> = <a href="#StringQuotedChars1_31_3" id="StringQuotedChars1_15_29" title="Defined at line 31, 37">StringQuotedChars1</a>
  <a href="#StringQuotedPart2_65_49" id="StringQuotedPart2_16_3" title="Referenced at line 65">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QStr2_16_21" title="Not referenced">QStr2</span></span> = <a href="#StringQuotedChars2_32_3" id="StringQuotedChars2_16_29" title="Defined at line 32, 38">StringQuotedChars2</a>
  <a href="#StringQuotedPart3_66_49" id="StringQuotedPart3_17_3" title="Referenced at line 66">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QStr3_17_21" title="Not referenced">QStr3</span></span> = <a href="#StringQuotedChars3_33_3" id="StringQuotedChars3_17_29" title="Defined at line 33, 39">StringQuotedChars3</a>
  <a href="#StringQuotedPart4_67_49" id="StringQuotedPart4_18_3" title="Referenced at line 67">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QStr4_18_21" title="Not referenced">QStr4</span></span> = <a href="#StringQuotedChars4_34_3" id="StringQuotedChars4_18_29" title="Defined at line 34, 40">StringQuotedChars4</a>

  <a href="#StringQuotedPart1_64_49" id="StringQuotedPart1_20_3" title="Referenced at line 64">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QDollar1_20_21" title="Not referenced">QDollar1</span></span> = <a href="#Dollar1_31_22" id="Dollar1_20_32" title="Defined at line 31, 42">Dollar1</a>
  <a href="#StringQuotedPart2_65_49" id="StringQuotedPart2_21_3" title="Referenced at line 65">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QDollar2_21_21" title="Not referenced">QDollar2</span></span> = <a href="#Dollar2_32_22" id="Dollar2_21_32" title="Defined at line 32, 43">Dollar2</a>
  <a href="#StringQuotedPart3_66_49" id="StringQuotedPart3_22_3" title="Referenced at line 66">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QDollar3_22_21" title="Not referenced">QDollar3</span></span> = <a href="#Dollar3_33_22" id="Dollar3_22_32" title="Defined at line 33, 44">Dollar3</a>
  <a href="#StringQuotedPart4_67_49" id="StringQuotedPart4_23_3" title="Referenced at line 67">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QDollar4_23_21" title="Not referenced">QDollar4</span></span> = <a href="#Dollar4_34_22" id="Dollar4_23_32" title="Defined at line 34, 45">Dollar4</a>

  <a href="#StringQuotedPart1_64_49" id="StringQuotedPart1_25_3" title="Referenced at line 64">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QBr1_25_21" title="Not referenced">QBr1</span></span> = <a href="#QuotedBracket1_31_30" id="QuotedBracket1_25_28" title="Defined at line 31, 47">QuotedBracket1</a>
  <a href="#StringQuotedPart2_65_49" id="StringQuotedPart2_26_3" title="Referenced at line 65">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QBr2_26_21" title="Not referenced">QBr2</span></span> = <a href="#QuotedBracket2_32_30" id="QuotedBracket2_26_28" title="Defined at line 32, 48">QuotedBracket2</a>
  <a href="#StringQuotedPart3_66_49" id="StringQuotedPart3_27_3" title="Referenced at line 66">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QBr3_27_21" title="Not referenced">QBr3</span></span> = <a href="#QuotedBracket3_33_30" id="QuotedBracket3_27_28" title="Defined at line 33, 49">QuotedBracket3</a>
  <a href="#StringQuotedPart4_67_49" id="StringQuotedPart4_28_3" title="Referenced at line 67">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QBr4_28_21" title="Not referenced">QBr4</span></span> = <a href="#QuotedBracket4_34_30" id="QuotedBracket4_28_28" title="Defined at line 34, 50">QuotedBracket4</a>

<span class="keyword">lexical sorts</span>
  <button class="modal-open" id="StringQuotedChars1_31_3" title="Multi-file references" data-urls="#StringQuotedChars1_15_29 line 15, 53; ../../deduplicated.sdf3/#StringQuotedChars1_55_28 line 55">StringQuotedChars1</button> <button class="modal-open" id="Dollar1_31_22" title="Multi-file references" data-urls="#Dollar1_20_32 line 20, 58; ../../deduplicated.sdf3/#Dollar1_60_31 line 60">Dollar1</button> <button class="modal-open" id="QuotedBracket1_31_30" title="Multi-file references" data-urls="#QuotedBracket1_25_28 line 25; ../../deduplicated.sdf3/#QuotedBracket1_65_27 line 65">QuotedBracket1</button>
  <button class="modal-open" id="StringQuotedChars2_32_3" title="Multi-file references" data-urls="#StringQuotedChars2_16_29 line 16, 54; ../../deduplicated.sdf3/#StringQuotedChars2_56_28 line 56">StringQuotedChars2</button> <button class="modal-open" id="Dollar2_32_22" title="Multi-file references" data-urls="#Dollar2_21_32 line 21, 59; ../../deduplicated.sdf3/#Dollar2_61_31 line 61">Dollar2</button> <button class="modal-open" id="QuotedBracket2_32_30" title="Multi-file references" data-urls="#QuotedBracket2_26_28 line 26; ../../deduplicated.sdf3/#QuotedBracket2_66_27 line 66">QuotedBracket2</button>
  <button class="modal-open" id="StringQuotedChars3_33_3" title="Multi-file references" data-urls="#StringQuotedChars3_17_29 line 17, 55; ../../deduplicated.sdf3/#StringQuotedChars3_57_28 line 57">StringQuotedChars3</button> <button class="modal-open" id="Dollar3_33_22" title="Multi-file references" data-urls="#Dollar3_22_32 line 22, 60; ../../deduplicated.sdf3/#Dollar3_62_31 line 62">Dollar3</button> <button class="modal-open" id="QuotedBracket3_33_30" title="Multi-file references" data-urls="#QuotedBracket3_27_28 line 27; ../../deduplicated.sdf3/#QuotedBracket3_67_27 line 67">QuotedBracket3</button>
  <button class="modal-open" id="StringQuotedChars4_34_3" title="Multi-file references" data-urls="#StringQuotedChars4_18_29 line 18, 56; ../../deduplicated.sdf3/#StringQuotedChars4_58_28 line 58">StringQuotedChars4</button> <button class="modal-open" id="Dollar4_34_22" title="Multi-file references" data-urls="#Dollar4_23_32 line 23, 61; ../../deduplicated.sdf3/#Dollar4_63_31 line 63">Dollar4</button> <button class="modal-open" id="QuotedBracket4_34_30" title="Multi-file references" data-urls="#QuotedBracket4_28_28 line 28; ../../deduplicated.sdf3/#QuotedBracket4_68_27 line 68">QuotedBracket4</button>

<span class="keyword">lexical syntax</span>
  <button class="modal-open" id="StringQuotedChars1_37_3" title="Multi-file references" data-urls="#StringQuotedChars1_15_29 line 15, 53; ../../deduplicated.sdf3/#StringQuotedChars1_55_28 line 55">StringQuotedChars1</button> = ~[\[\]\$]+
  <button class="modal-open" id="StringQuotedChars2_38_3" title="Multi-file references" data-urls="#StringQuotedChars2_16_29 line 16, 54; ../../deduplicated.sdf3/#StringQuotedChars2_56_28 line 56">StringQuotedChars2</button> = ~[\{\}\$]+
  <button class="modal-open" id="StringQuotedChars3_39_3" title="Multi-file references" data-urls="#StringQuotedChars3_17_29 line 17, 55; ../../deduplicated.sdf3/#StringQuotedChars3_57_28 line 57">StringQuotedChars3</button> = ~[\(\)\$]+
  <button class="modal-open" id="StringQuotedChars4_40_3" title="Multi-file references" data-urls="#StringQuotedChars4_18_29 line 18, 56; ../../deduplicated.sdf3/#StringQuotedChars4_58_28 line 58">StringQuotedChars4</button> = ~[\&lt;\&gt;\$]+

  <button class="modal-open" id="Dollar1_42_3" title="Multi-file references" data-urls="#Dollar1_20_32 line 20, 58; ../../deduplicated.sdf3/#Dollar1_60_31 line 60">Dollar1</button> = <span class="cons_Lit">"$"</span>
  <button class="modal-open" id="Dollar2_43_3" title="Multi-file references" data-urls="#Dollar2_21_32 line 21, 59; ../../deduplicated.sdf3/#Dollar2_61_31 line 61">Dollar2</button> = <span class="cons_Lit">"$"</span>
  <button class="modal-open" id="Dollar3_44_3" title="Multi-file references" data-urls="#Dollar3_22_32 line 22, 60; ../../deduplicated.sdf3/#Dollar3_62_31 line 62">Dollar3</button> = <span class="cons_Lit">"$"</span>
  <button class="modal-open" id="Dollar4_45_3" title="Multi-file references" data-urls="#Dollar4_23_32 line 23, 61; ../../deduplicated.sdf3/#Dollar4_63_31 line 63">Dollar4</button> = <span class="cons_Lit">"$"</span>

  <button class="modal-open" id="QuotedBracket1_47_3" title="Multi-file references" data-urls="#QuotedBracket1_25_28 line 25; ../../deduplicated.sdf3/#QuotedBracket1_65_27 line 65">QuotedBracket1</button> = <span class="cons_Lit">"$"</span> [\[\]] <span class="cons_Lit">"$"</span>
  <button class="modal-open" id="QuotedBracket2_48_3" title="Multi-file references" data-urls="#QuotedBracket2_26_28 line 26; ../../deduplicated.sdf3/#QuotedBracket2_66_27 line 66">QuotedBracket2</button> = <span class="cons_Lit">"$"</span> [\{\}] <span class="cons_Lit">"$"</span>
  <button class="modal-open" id="QuotedBracket3_49_3" title="Multi-file references" data-urls="#QuotedBracket3_27_28 line 27; ../../deduplicated.sdf3/#QuotedBracket3_67_27 line 67">QuotedBracket3</button> = <span class="cons_Lit">"$"</span> [\(\)] <span class="cons_Lit">"$"</span>
  <button class="modal-open" id="QuotedBracket4_50_3" title="Multi-file references" data-urls="#QuotedBracket4_28_28 line 28; ../../deduplicated.sdf3/#QuotedBracket4_68_27 line 68">QuotedBracket4</button> = <span class="cons_Lit">"$"</span> [\&lt;\&gt;] <span class="cons_Lit">"$"</span>

<span class="keyword">lexical restrictions</span>
  <a href="#StringQuotedChars1_31_3" id="StringQuotedChars1_53_3" title="Defined at line 31, 37">StringQuotedChars1</a> -/- ~[\[\]\$]
  <a href="#StringQuotedChars2_32_3" id="StringQuotedChars2_54_3" title="Defined at line 32, 38">StringQuotedChars2</a> -/- ~[\{\}\$]
  <a href="#StringQuotedChars3_33_3" id="StringQuotedChars3_55_3" title="Defined at line 33, 39">StringQuotedChars3</a> -/- ~[\(\)\$]
  <a href="#StringQuotedChars4_34_3" id="StringQuotedChars4_56_3" title="Defined at line 34, 40">StringQuotedChars4</a> -/- ~[\&lt;\&gt;\$]

  <a href="#Dollar1_31_22" id="Dollar1_58_3" title="Defined at line 31, 42">Dollar1</a> -/- [\[\]].[\$]
  <a href="#Dollar2_32_22" id="Dollar2_59_3" title="Defined at line 32, 43">Dollar2</a> -/- [\{\}].[\$]
  <a href="#Dollar3_33_22" id="Dollar3_60_3" title="Defined at line 33, 44">Dollar3</a> -/- [\(\)].[\$]
  <a href="#Dollar4_34_22" id="Dollar4_61_3" title="Defined at line 34, 45">Dollar4</a> -/- [\&lt;\&gt;].[\$]

<span class="keyword">syntax</span>
  <a href="#StringQuotation_13_13" id="StringQuotation_64_3" title="Referenced at line 13">StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation1_64_22" title="Not referenced">StringQuotation1</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"["</span> <a href="#StringQuotedPart1_7_3" id="StringQuotedPart1_64_49" title="Defined at line 7, 15, 20, 25, 69">StringQuotedPart1</a><span class="keyword">-CF</span>* <span class="cons_Lit">"]"</span>
  <a href="#StringQuotation_13_13" id="StringQuotation_65_3" title="Referenced at line 13">StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation2_65_22" title="Not referenced">StringQuotation2</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"{"</span> <a href="#StringQuotedPart2_8_3" id="StringQuotedPart2_65_49" title="Defined at line 8, 16, 21, 26, 70">StringQuotedPart2</a><span class="keyword">-CF</span>* <span class="cons_Lit">"}"</span>
  <a href="#StringQuotation_13_13" id="StringQuotation_66_3" title="Referenced at line 13">StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation3_66_22" title="Not referenced">StringQuotation3</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"("</span> <a href="#StringQuotedPart3_9_3" id="StringQuotedPart3_66_49" title="Defined at line 9, 17, 22, 27, 71">StringQuotedPart3</a><span class="keyword">-CF</span>* <span class="cons_Lit">")"</span>
  <a href="#StringQuotation_13_13" id="StringQuotation_67_3" title="Referenced at line 13">StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation4_67_22" title="Not referenced">StringQuotation4</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"&lt;"</span> <a href="#StringQuotedPart4_10_3" id="StringQuotedPart4_67_49" title="Defined at line 10, 18, 23, 28, 72">StringQuotedPart4</a><span class="keyword">-CF</span>* <span class="cons_Lit">"&gt;"</span>

  <a href="#StringQuotedPart1_64_49" id="StringQuotedPart1_69_3" title="Referenced at line 64">StringQuotedPart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape1_69_24" title="Not referenced">StringEscape1</span></span> = <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3/#Term_13_20" id="Term_69_55" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span>
  <a href="#StringQuotedPart2_65_49" id="StringQuotedPart2_70_3" title="Referenced at line 65">StringQuotedPart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape2_70_24" title="Not referenced">StringEscape2</span></span> = <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3/#Term_13_20" id="Term_70_55" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span>
  <a href="#StringQuotedPart3_66_49" id="StringQuotedPart3_71_3" title="Referenced at line 66">StringQuotedPart3</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape3_71_24" title="Not referenced">StringEscape3</span></span> = <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3/#Term_13_20" id="Term_71_55" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>
  <a href="#StringQuotedPart4_67_49" id="StringQuotedPart4_72_3" title="Referenced at line 67">StringQuotedPart4</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape4_72_24" title="Not referenced">StringEscape4</span></span> = <span class="cons_Lit">"&lt;"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3/#Term_13_20" id="Term_72_55" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"&gt;"</span>

<span class="layout">// The following is the AST that is expected by Stratego compiler, but the Padding literal was</span>
<span class="layout">//   filled by a hack in SDF2/JSGLR1 and is now done in postprocessing.</span>
<span class="keyword">context-free sorts</span>
  <span id="InternalStringQuotation_77_3" title="Not referenced">InternalStringQuotation</span>
  <a href="#InternalStringQuotedPart1_84_69" id="InternalStringQuotedPart1_78_3" title="Referenced at line 84">InternalStringQuotedPart1</a>
  <a href="#InternalStringQuotedPart2_85_69" id="InternalStringQuotedPart2_79_3" title="Referenced at line 85">InternalStringQuotedPart2</a>
  <a href="#InternalStringQuotedPart3_86_69" id="InternalStringQuotedPart3_80_3" title="Referenced at line 86">InternalStringQuotedPart3</a>
  <a href="#InternalStringQuotedPart4_87_69" id="InternalStringQuotedPart4_81_3" title="Referenced at line 87">InternalStringQuotedPart4</a>
<span class="keyword">syntax</span>

  <span id="InternalStringQuotation_84_3" title="Not referenced">InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation1_84_30" title="Not referenced">StringQuotation1</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"["</span> <a href="#Padding_94_15" id="Padding_84_57" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <a href="#InternalStringQuotedPart1_78_3" id="InternalStringQuotedPart1_84_69" title="Defined at line 78, 89">InternalStringQuotedPart1</a><span class="keyword">-CF</span>* <span class="cons_Lit">"]"</span>
  <span id="InternalStringQuotation_85_3" title="Not referenced">InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation2_85_30" title="Not referenced">StringQuotation2</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"{"</span> <a href="#Padding_94_15" id="Padding_85_57" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <a href="#InternalStringQuotedPart2_79_3" id="InternalStringQuotedPart2_85_69" title="Defined at line 79, 90">InternalStringQuotedPart2</a><span class="keyword">-CF</span>* <span class="cons_Lit">"}"</span>
  <span id="InternalStringQuotation_86_3" title="Not referenced">InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation3_86_30" title="Not referenced">StringQuotation3</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"("</span> <a href="#Padding_94_15" id="Padding_86_57" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <a href="#InternalStringQuotedPart3_80_3" id="InternalStringQuotedPart3_86_69" title="Defined at line 80, 91">InternalStringQuotedPart3</a><span class="keyword">-CF</span>* <span class="cons_Lit">")"</span>
  <span id="InternalStringQuotation_87_3" title="Not referenced">InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation4_87_30" title="Not referenced">StringQuotation4</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"&lt;"</span> <a href="#Padding_94_15" id="Padding_87_57" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <a href="#InternalStringQuotedPart4_81_3" id="InternalStringQuotedPart4_87_69" title="Defined at line 81, 92">InternalStringQuotedPart4</a><span class="keyword">-CF</span>* <span class="cons_Lit">"&gt;"</span>

  <a href="#InternalStringQuotedPart1_84_69" id="InternalStringQuotedPart1_89_3" title="Referenced at line 84">InternalStringQuotedPart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape1_89_32" title="Not referenced">StringEscape1</span></span> = <a href="#Padding_94_15" id="Padding_89_48" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3/#Term_13_20" id="Term_89_75" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span>
  <a href="#InternalStringQuotedPart2_85_69" id="InternalStringQuotedPart2_90_3" title="Referenced at line 85">InternalStringQuotedPart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape2_90_32" title="Not referenced">StringEscape2</span></span> = <a href="#Padding_94_15" id="Padding_90_48" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3/#Term_13_20" id="Term_90_75" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span>
  <a href="#InternalStringQuotedPart3_86_69" id="InternalStringQuotedPart3_91_3" title="Referenced at line 86">InternalStringQuotedPart3</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape3_91_32" title="Not referenced">StringEscape3</span></span> = <a href="#Padding_94_15" id="Padding_91_48" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3/#Term_13_20" id="Term_91_75" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>
  <a href="#InternalStringQuotedPart4_87_69" id="InternalStringQuotedPart4_92_3" title="Referenced at line 87">InternalStringQuotedPart4</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape4_92_32" title="Not referenced">StringEscape4</span></span> = <a href="#Padding_94_15" id="Padding_92_48" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"&lt;"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3/#Term_13_20" id="Term_92_75" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"&gt;"</span>

<span class="keyword">lexical sorts</span> <a href="#Padding_84_57" id="Padding_94_15" title="Referenced at line 84, 85, 86, 87, 89, 90, 91, 92">Padding</a>
<span class="keyword">lexical syntax</span>

  <a href="#Padding_84_57" id="Padding_97_3" title="Referenced at line 84, 85, 86, 87, 89, 90, 91, 92">Padding</a> = <span class="cons_CiLit">' '</span>+

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
