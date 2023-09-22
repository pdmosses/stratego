---
title: string-quotations.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../constants.sdf3#sugar/string-quotations_70_93" id="sugar/string-quotations_7_30" title="Referenced at ../constants.sdf3 line 6">sugar/string-quotations</a>

<span class="keyword">imports</span> <a href="../../core/terms.sdf3#core/terms_7_17" id="core/terms_40_50" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>

<span class="keyword">context-free sorts</span>
  <a href="#StringQuotation_202_217" id="StringQuotation_73_88" title="Referenced at line 13">StringQuotation</a>
  <a href="#StringQuotedPart1_1601_1618" id="StringQuotedPart1_91_108" title="Referenced at line 64">StringQuotedPart1</a>
  <a href="#StringQuotedPart2_1675_1692" id="StringQuotedPart2_111_128" title="Referenced at line 65">StringQuotedPart2</a>
  <a href="#StringQuotedPart3_1749_1766" id="StringQuotedPart3_131_148" title="Referenced at line 66">StringQuotedPart3</a>
  <a href="#StringQuotedPart4_1823_1840" id="StringQuotedPart4_151_168" title="Referenced at line 67">StringQuotedPart4</a>

<span class="keyword">context-free syntax</span>
  <span id="PreTerm_192_199" title="Not referenced locally, nor via imports">PreTerm</span> = <a href="#StringQuotation_73_88" id="StringQuotation_202_217" title="Defined at line 6, 64, 65, 66, 67">StringQuotation</a>

  <a href="#StringQuotedPart1_1601_1618" id="StringQuotedPart1_221_238" title="Referenced at line 64">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QStr1_239_244" title="Not referenced locally, nor via imports">QStr1</span></span> = <a href="#StringQuotedChars1_750_768" id="StringQuotedChars1_247_265" title="Defined at line 31, 37">StringQuotedChars1</a>
  <a href="#StringQuotedPart2_1675_1692" id="StringQuotedPart2_268_285" title="Referenced at line 65">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QStr2_286_291" title="Not referenced locally, nor via imports">QStr2</span></span> = <a href="#StringQuotedChars2_794_812" id="StringQuotedChars2_294_312" title="Defined at line 32, 38">StringQuotedChars2</a>
  <a href="#StringQuotedPart3_1749_1766" id="StringQuotedPart3_315_332" title="Referenced at line 66">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QStr3_333_338" title="Not referenced locally, nor via imports">QStr3</span></span> = <a href="#StringQuotedChars3_838_856" id="StringQuotedChars3_341_359" title="Defined at line 33, 39">StringQuotedChars3</a>
  <a href="#StringQuotedPart4_1823_1840" id="StringQuotedPart4_362_379" title="Referenced at line 67">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QStr4_380_385" title="Not referenced locally, nor via imports">QStr4</span></span> = <a href="#StringQuotedChars4_882_900" id="StringQuotedChars4_388_406" title="Defined at line 34, 40">StringQuotedChars4</a>

  <a href="#StringQuotedPart1_1601_1618" id="StringQuotedPart1_410_427" title="Referenced at line 64">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QDollar1_428_436" title="Not referenced locally, nor via imports">QDollar1</span></span> = <a href="#Dollar1_769_776" id="Dollar1_439_446" title="Defined at line 31, 42">Dollar1</a>
  <a href="#StringQuotedPart2_1675_1692" id="StringQuotedPart2_449_466" title="Referenced at line 65">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QDollar2_467_475" title="Not referenced locally, nor via imports">QDollar2</span></span> = <a href="#Dollar2_813_820" id="Dollar2_478_485" title="Defined at line 32, 43">Dollar2</a>
  <a href="#StringQuotedPart3_1749_1766" id="StringQuotedPart3_488_505" title="Referenced at line 66">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QDollar3_506_514" title="Not referenced locally, nor via imports">QDollar3</span></span> = <a href="#Dollar3_857_864" id="Dollar3_517_524" title="Defined at line 33, 44">Dollar3</a>
  <a href="#StringQuotedPart4_1823_1840" id="StringQuotedPart4_527_544" title="Referenced at line 67">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QDollar4_545_553" title="Not referenced locally, nor via imports">QDollar4</span></span> = <a href="#Dollar4_901_908" id="Dollar4_556_563" title="Defined at line 34, 45">Dollar4</a>

  <a href="#StringQuotedPart1_1601_1618" id="StringQuotedPart1_567_584" title="Referenced at line 64">StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QBr1_585_589" title="Not referenced locally, nor via imports">QBr1</span></span> = <a href="#QuotedBracket1_777_791" id="QuotedBracket1_592_606" title="Defined at line 31, 47">QuotedBracket1</a>
  <a href="#StringQuotedPart2_1675_1692" id="StringQuotedPart2_609_626" title="Referenced at line 65">StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QBr2_627_631" title="Not referenced locally, nor via imports">QBr2</span></span> = <a href="#QuotedBracket2_821_835" id="QuotedBracket2_634_648" title="Defined at line 32, 48">QuotedBracket2</a>
  <a href="#StringQuotedPart3_1749_1766" id="StringQuotedPart3_651_668" title="Referenced at line 66">StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QBr3_669_673" title="Not referenced locally, nor via imports">QBr3</span></span> = <a href="#QuotedBracket3_865_879" id="QuotedBracket3_676_690" title="Defined at line 33, 49">QuotedBracket3</a>
  <a href="#StringQuotedPart4_1823_1840" id="StringQuotedPart4_693_710" title="Referenced at line 67">StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QBr4_711_715" title="Not referenced locally, nor via imports">QBr4</span></span> = <a href="#QuotedBracket4_909_923" id="QuotedBracket4_718_732" title="Defined at line 34, 50">QuotedBracket4</a>

<span class="keyword">lexical sorts</span>
  <a href="#StringQuotedChars1_1302_1320" id="StringQuotedChars1_750_768" title="Referenced at line 53; ../../deduplicated.sdf3 line 55">StringQuotedChars1</a> <a href="#Dollar1_1443_1450" id="Dollar1_769_776" title="Referenced at line 58; ../../deduplicated.sdf3 line 60">Dollar1</a> <a href="#QuotedBracket1_592_606" id="QuotedBracket1_777_791" title="Referenced at line 25; ../../deduplicated.sdf3 line 65">QuotedBracket1</a>
  <a href="#StringQuotedChars2_1337_1355" id="StringQuotedChars2_794_812" title="Referenced at line 54; ../../deduplicated.sdf3 line 56">StringQuotedChars2</a> <a href="#Dollar2_1469_1476" id="Dollar2_813_820" title="Referenced at line 59; ../../deduplicated.sdf3 line 61">Dollar2</a> <a href="#QuotedBracket2_634_648" id="QuotedBracket2_821_835" title="Referenced at line 26; ../../deduplicated.sdf3 line 66">QuotedBracket2</a>
  <a href="#StringQuotedChars3_1372_1390" id="StringQuotedChars3_838_856" title="Referenced at line 55; ../../deduplicated.sdf3 line 57">StringQuotedChars3</a> <a href="#Dollar3_1495_1502" id="Dollar3_857_864" title="Referenced at line 60; ../../deduplicated.sdf3 line 62">Dollar3</a> <a href="#QuotedBracket3_676_690" id="QuotedBracket3_865_879" title="Referenced at line 27; ../../deduplicated.sdf3 line 67">QuotedBracket3</a>
  <a href="#StringQuotedChars4_1407_1425" id="StringQuotedChars4_882_900" title="Referenced at line 56; ../../deduplicated.sdf3 line 58">StringQuotedChars4</a> <a href="#Dollar4_1521_1528" id="Dollar4_901_908" title="Referenced at line 61; ../../deduplicated.sdf3 line 63">Dollar4</a> <a href="#QuotedBracket4_718_732" id="QuotedBracket4_909_923" title="Referenced at line 28; ../../deduplicated.sdf3 line 68">QuotedBracket4</a>

<span class="keyword">lexical syntax</span>
  <a href="#StringQuotedChars1_1302_1320" id="StringQuotedChars1_942_960" title="Referenced at line 53; ../../deduplicated.sdf3 line 55">StringQuotedChars1</a> = ~[\[\]\$]+
  <a href="#StringQuotedChars2_1337_1355" id="StringQuotedChars2_976_994" title="Referenced at line 54; ../../deduplicated.sdf3 line 56">StringQuotedChars2</a> = ~[\{\}\$]+
  <a href="#StringQuotedChars3_1372_1390" id="StringQuotedChars3_1010_1028" title="Referenced at line 55; ../../deduplicated.sdf3 line 57">StringQuotedChars3</a> = ~[\(\)\$]+
  <a href="#StringQuotedChars4_1407_1425" id="StringQuotedChars4_1044_1062" title="Referenced at line 56; ../../deduplicated.sdf3 line 58">StringQuotedChars4</a> = ~[\&lt;\&gt;\$]+

  <a href="#Dollar1_1443_1450" id="Dollar1_1079_1086" title="Referenced at line 58; ../../deduplicated.sdf3 line 60">Dollar1</a> = <span class="cons_Lit">"$"</span>
  <a href="#Dollar2_1469_1476" id="Dollar2_1095_1102" title="Referenced at line 59; ../../deduplicated.sdf3 line 61">Dollar2</a> = <span class="cons_Lit">"$"</span>
  <a href="#Dollar3_1495_1502" id="Dollar3_1111_1118" title="Referenced at line 60; ../../deduplicated.sdf3 line 62">Dollar3</a> = <span class="cons_Lit">"$"</span>
  <a href="#Dollar4_1521_1528" id="Dollar4_1127_1134" title="Referenced at line 61; ../../deduplicated.sdf3 line 63">Dollar4</a> = <span class="cons_Lit">"$"</span>

  <a href="#QuotedBracket1_592_606" id="QuotedBracket1_1144_1158" title="Referenced at line 25; ../../deduplicated.sdf3 line 65">QuotedBracket1</a> = <span class="cons_Lit">"$"</span> [\[\]] <span class="cons_Lit">"$"</span>
  <a href="#QuotedBracket2_634_648" id="QuotedBracket2_1178_1192" title="Referenced at line 26; ../../deduplicated.sdf3 line 66">QuotedBracket2</a> = <span class="cons_Lit">"$"</span> [\{\}] <span class="cons_Lit">"$"</span>
  <a href="#QuotedBracket3_676_690" id="QuotedBracket3_1212_1226" title="Referenced at line 27; ../../deduplicated.sdf3 line 67">QuotedBracket3</a> = <span class="cons_Lit">"$"</span> [\(\)] <span class="cons_Lit">"$"</span>
  <a href="#QuotedBracket4_718_732" id="QuotedBracket4_1246_1260" title="Referenced at line 28; ../../deduplicated.sdf3 line 68">QuotedBracket4</a> = <span class="cons_Lit">"$"</span> [\&lt;\&gt;] <span class="cons_Lit">"$"</span>

<span class="keyword">lexical restrictions</span>
  <a href="#StringQuotedChars1_750_768" id="StringQuotedChars1_1302_1320" title="Defined at line 31, 37">StringQuotedChars1</a> -/- ~[\[\]\$]
  <a href="#StringQuotedChars2_794_812" id="StringQuotedChars2_1337_1355" title="Defined at line 32, 38">StringQuotedChars2</a> -/- ~[\{\}\$]
  <a href="#StringQuotedChars3_838_856" id="StringQuotedChars3_1372_1390" title="Defined at line 33, 39">StringQuotedChars3</a> -/- ~[\(\)\$]
  <a href="#StringQuotedChars4_882_900" id="StringQuotedChars4_1407_1425" title="Defined at line 34, 40">StringQuotedChars4</a> -/- ~[\&lt;\&gt;\$]

  <a href="#Dollar1_769_776" id="Dollar1_1443_1450" title="Defined at line 31, 42">Dollar1</a> -/- [\[\]].[\$]
  <a href="#Dollar2_813_820" id="Dollar2_1469_1476" title="Defined at line 32, 43">Dollar2</a> -/- [\{\}].[\$]
  <a href="#Dollar3_857_864" id="Dollar3_1495_1502" title="Defined at line 33, 44">Dollar3</a> -/- [\(\)].[\$]
  <a href="#Dollar4_901_908" id="Dollar4_1521_1528" title="Defined at line 34, 45">Dollar4</a> -/- [\&lt;\&gt;].[\$]

<span class="keyword">syntax</span>
  <a href="#StringQuotation_202_217" id="StringQuotation_1555_1570" title="Referenced at line 13">StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation1_1574_1590" title="Not referenced locally, nor via imports">StringQuotation1</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"["</span> <a href="#StringQuotedPart1_91_108" id="StringQuotedPart1_1601_1618" title="Defined at line 7, 15, 20, 25, 69">StringQuotedPart1</a><span class="keyword">-CF</span>* <span class="cons_Lit">"]"</span>
  <a href="#StringQuotation_202_217" id="StringQuotation_1629_1644" title="Referenced at line 13">StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation2_1648_1664" title="Not referenced locally, nor via imports">StringQuotation2</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"{"</span> <a href="#StringQuotedPart2_111_128" id="StringQuotedPart2_1675_1692" title="Defined at line 8, 16, 21, 26, 70">StringQuotedPart2</a><span class="keyword">-CF</span>* <span class="cons_Lit">"}"</span>
  <a href="#StringQuotation_202_217" id="StringQuotation_1703_1718" title="Referenced at line 13">StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation3_1722_1738" title="Not referenced locally, nor via imports">StringQuotation3</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"("</span> <a href="#StringQuotedPart3_131_148" id="StringQuotedPart3_1749_1766" title="Defined at line 9, 17, 22, 27, 71">StringQuotedPart3</a><span class="keyword">-CF</span>* <span class="cons_Lit">")"</span>
  <a href="#StringQuotation_202_217" id="StringQuotation_1777_1792" title="Referenced at line 13">StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation4_1796_1812" title="Not referenced locally, nor via imports">StringQuotation4</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"&lt;"</span> <a href="#StringQuotedPart4_151_168" id="StringQuotedPart4_1823_1840" title="Defined at line 10, 18, 23, 28, 72">StringQuotedPart4</a><span class="keyword">-CF</span>* <span class="cons_Lit">"&gt;"</span>

  <a href="#StringQuotedPart1_1601_1618" id="StringQuotedPart1_1852_1869" title="Referenced at line 64">StringQuotedPart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape1_1873_1886" title="Not referenced locally, nor via imports">StringEscape1</span></span> = <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3#Term_180_184" id="Term_1904_1908" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span>
  <a href="#StringQuotedPart2_1675_1692" id="StringQuotedPart2_1929_1946" title="Referenced at line 65">StringQuotedPart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape2_1950_1963" title="Not referenced locally, nor via imports">StringEscape2</span></span> = <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3#Term_180_184" id="Term_1981_1985" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span>
  <a href="#StringQuotedPart3_1749_1766" id="StringQuotedPart3_2006_2023" title="Referenced at line 66">StringQuotedPart3</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape3_2027_2040" title="Not referenced locally, nor via imports">StringEscape3</span></span> = <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3#Term_180_184" id="Term_2058_2062" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>
  <a href="#StringQuotedPart4_1823_1840" id="StringQuotedPart4_2083_2100" title="Referenced at line 67">StringQuotedPart4</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape4_2104_2117" title="Not referenced locally, nor via imports">StringEscape4</span></span> = <span class="cons_Lit">"&lt;"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3#Term_180_184" id="Term_2135_2139" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"&gt;"</span>

<span class="layout">// The following is the AST that is expected by Stratego compiler, but the Padding literal was</span>
<span class="layout">//   filled by a hack in SDF2/JSGLR1 and is now done in postprocessing.</span>
<span class="keyword">context-free sorts</span>
  <span id="InternalStringQuotation_2347_2370" title="Not referenced locally, nor via imports">InternalStringQuotation</span>
  <a href="#InternalStringQuotedPart1_2559_2584" id="InternalStringQuotedPart1_2373_2398" title="Referenced at line 84">InternalStringQuotedPart1</a>
  <a href="#InternalStringQuotedPart2_2661_2686" id="InternalStringQuotedPart2_2401_2426" title="Referenced at line 85">InternalStringQuotedPart2</a>
  <a href="#InternalStringQuotedPart3_2763_2788" id="InternalStringQuotedPart3_2429_2454" title="Referenced at line 86">InternalStringQuotedPart3</a>
  <a href="#InternalStringQuotedPart4_2865_2890" id="InternalStringQuotedPart4_2457_2482" title="Referenced at line 87">InternalStringQuotedPart4</a>
<span class="keyword">syntax</span>

  <span id="InternalStringQuotation_2493_2516" title="Not referenced locally, nor via imports">InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation1_2520_2536" title="Not referenced locally, nor via imports">StringQuotation1</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"["</span> <a href="#Padding_3303_3310" id="Padding_2547_2554" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <a href="#InternalStringQuotedPart1_2373_2398" id="InternalStringQuotedPart1_2559_2584" title="Defined at line 78, 89">InternalStringQuotedPart1</a><span class="keyword">-CF</span>* <span class="cons_Lit">"]"</span>
  <span id="InternalStringQuotation_2595_2618" title="Not referenced locally, nor via imports">InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation2_2622_2638" title="Not referenced locally, nor via imports">StringQuotation2</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"{"</span> <a href="#Padding_3303_3310" id="Padding_2649_2656" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <a href="#InternalStringQuotedPart2_2401_2426" id="InternalStringQuotedPart2_2661_2686" title="Defined at line 79, 90">InternalStringQuotedPart2</a><span class="keyword">-CF</span>* <span class="cons_Lit">"}"</span>
  <span id="InternalStringQuotation_2697_2720" title="Not referenced locally, nor via imports">InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation3_2724_2740" title="Not referenced locally, nor via imports">StringQuotation3</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"("</span> <a href="#Padding_3303_3310" id="Padding_2751_2758" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <a href="#InternalStringQuotedPart3_2429_2454" id="InternalStringQuotedPart3_2763_2788" title="Defined at line 80, 91">InternalStringQuotedPart3</a><span class="keyword">-CF</span>* <span class="cons_Lit">")"</span>
  <span id="InternalStringQuotation_2799_2822" title="Not referenced locally, nor via imports">InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation4_2826_2842" title="Not referenced locally, nor via imports">StringQuotation4</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"&lt;"</span> <a href="#Padding_3303_3310" id="Padding_2853_2860" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <a href="#InternalStringQuotedPart4_2457_2482" id="InternalStringQuotedPart4_2865_2890" title="Defined at line 81, 92">InternalStringQuotedPart4</a><span class="keyword">-CF</span>* <span class="cons_Lit">"&gt;"</span>

  <a href="#InternalStringQuotedPart1_2559_2584" id="InternalStringQuotedPart1_2902_2927" title="Referenced at line 84">InternalStringQuotedPart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape1_2931_2944" title="Not referenced locally, nor via imports">StringEscape1</span></span> = <a href="#Padding_3303_3310" id="Padding_2947_2954" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3#Term_180_184" id="Term_2974_2978" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span>
  <a href="#InternalStringQuotedPart2_2661_2686" id="InternalStringQuotedPart2_2999_3024" title="Referenced at line 85">InternalStringQuotedPart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape2_3028_3041" title="Not referenced locally, nor via imports">StringEscape2</span></span> = <a href="#Padding_3303_3310" id="Padding_3044_3051" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3#Term_180_184" id="Term_3071_3075" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span>
  <a href="#InternalStringQuotedPart3_2763_2788" id="InternalStringQuotedPart3_3096_3121" title="Referenced at line 86">InternalStringQuotedPart3</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape3_3125_3138" title="Not referenced locally, nor via imports">StringEscape3</span></span> = <a href="#Padding_3303_3310" id="Padding_3141_3148" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3#Term_180_184" id="Term_3168_3172" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span>
  <a href="#InternalStringQuotedPart4_2865_2890" id="InternalStringQuotedPart4_3193_3218" title="Referenced at line 87">InternalStringQuotedPart4</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape4_3222_3235" title="Not referenced locally, nor via imports">StringEscape4</span></span> = <a href="#Padding_3303_3310" id="Padding_3238_3245" title="Defined at line 94, 97">Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"&lt;"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms.sdf3#Term_180_184" id="Term_3265_3269" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"&gt;"</span>

<span class="keyword">lexical sorts</span> <a href="#Padding_3238_3245" id="Padding_3303_3310" title="Referenced at line 92">Padding</a>
<span class="keyword">lexical syntax</span>

  <a href="#Padding_3238_3245" id="Padding_3329_3336" title="Referenced at line 92">Padding</a> = <span class="cons_CiLit">' '</span>+

</code></pre></td></tr></tbody></table></div>