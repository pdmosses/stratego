---
title: string-quotations-namespaced.sdf3
---

# `string-quotations-namespaced.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/string-quotations-namespaced.sdf3]

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../constants-namespaced.sdf3#StrategoLang/sugar/string-quotations-namespaced_144_191" id="StrategoLang/sugar/string-quotations-namespaced_7_54" title="Referenced at ../constants-namespaced.sdf3 line 6">StrategoLang/sugar/string-quotations-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/terms-namespaced.sdf3#StrategoLang/core/terms-namespaced_7_41" id="StrategoLang/core/terms-namespaced_66_100" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>

<span class="keyword">sorts</span> <a href="#StrategoLang-StringQuotation_308_336" id="StrategoLang-StringQuotation_108_136" title="Referenced at line 10">StrategoLang-StringQuotation</a> <a href="#StrategoLang-StringQuotedPart1_2434_2464" id="StrategoLang-StringQuotedPart1_137_167" title="Referenced at line 54">StrategoLang-StringQuotedPart1</a> <a href="#StrategoLang-StringQuotedPart2_2538_2568" id="StrategoLang-StringQuotedPart2_168_198" title="Referenced at line 55">StrategoLang-StringQuotedPart2</a> <a href="#StrategoLang-StringQuotedPart3_2642_2672" id="StrategoLang-StringQuotedPart3_199_229" title="Referenced at line 56">StrategoLang-StringQuotedPart3</a> <a href="#StrategoLang-StringQuotedPart4_2746_2776" id="StrategoLang-StringQuotedPart4_230_260" title="Referenced at line 57">StrategoLang-StringQuotedPart4</a>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-PreTerm_285_305" title="Not referenced locally, nor via imports">StrategoLang-PreTerm</span> = <a href="#StrategoLang-StringQuotation_108_136" id="StrategoLang-StringQuotation_308_336" title="Defined at line 6, 54, 55, 56, 57">StrategoLang-StringQuotation</a> { }
  <a href="#StrategoLang-StringQuotedPart1_2434_2464" id="StrategoLang-StringQuotedPart1_343_373" title="Referenced at line 54">StrategoLang-StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QStr1_374_379" title="Not referenced locally, nor via imports">QStr1</span></span> = <a href="#StrategoLang-StringQuotedChars1_1455_1486" id="StrategoLang-StringQuotedChars1_382_413" title="Defined at line 28">StrategoLang-StringQuotedChars1</a> { }
  <a href="#StrategoLang-StringQuotedPart2_2538_2568" id="StrategoLang-StringQuotedPart2_420_450" title="Referenced at line 55">StrategoLang-StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QStr2_451_456" title="Not referenced locally, nor via imports">QStr2</span></span> = <a href="#StrategoLang-StringQuotedChars2_1506_1537" id="StrategoLang-StringQuotedChars2_459_490" title="Defined at line 29">StrategoLang-StringQuotedChars2</a> { }
  <a href="#StrategoLang-StringQuotedPart3_2642_2672" id="StrategoLang-StringQuotedPart3_497_527" title="Referenced at line 56">StrategoLang-StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QStr3_528_533" title="Not referenced locally, nor via imports">QStr3</span></span> = <a href="#StrategoLang-StringQuotedChars3_1557_1588" id="StrategoLang-StringQuotedChars3_536_567" title="Defined at line 30">StrategoLang-StringQuotedChars3</a> { }
  <a href="#StrategoLang-StringQuotedPart4_2746_2776" id="StrategoLang-StringQuotedPart4_574_604" title="Referenced at line 57">StrategoLang-StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QStr4_605_610" title="Not referenced locally, nor via imports">QStr4</span></span> = <a href="#StrategoLang-StringQuotedChars4_1608_1639" id="StrategoLang-StringQuotedChars4_613_644" title="Defined at line 31">StrategoLang-StringQuotedChars4</a> { }
  <a href="#StrategoLang-StringQuotedPart1_2434_2464" id="StrategoLang-StringQuotedPart1_651_681" title="Referenced at line 54">StrategoLang-StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QDollar1_682_690" title="Not referenced locally, nor via imports">QDollar1</span></span> = <a href="#StrategoLang-Dollar1_1659_1679" id="StrategoLang-Dollar1_693_713" title="Defined at line 32">StrategoLang-Dollar1</a> { }
  <a href="#StrategoLang-StringQuotedPart2_2538_2568" id="StrategoLang-StringQuotedPart2_720_750" title="Referenced at line 55">StrategoLang-StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QDollar2_751_759" title="Not referenced locally, nor via imports">QDollar2</span></span> = <a href="#StrategoLang-Dollar2_1692_1712" id="StrategoLang-Dollar2_762_782" title="Defined at line 33">StrategoLang-Dollar2</a> { }
  <a href="#StrategoLang-StringQuotedPart3_2642_2672" id="StrategoLang-StringQuotedPart3_789_819" title="Referenced at line 56">StrategoLang-StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QDollar3_820_828" title="Not referenced locally, nor via imports">QDollar3</span></span> = <a href="#StrategoLang-Dollar3_1725_1745" id="StrategoLang-Dollar3_831_851" title="Defined at line 34">StrategoLang-Dollar3</a> { }
  <a href="#StrategoLang-StringQuotedPart4_2746_2776" id="StrategoLang-StringQuotedPart4_858_888" title="Referenced at line 57">StrategoLang-StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QDollar4_889_897" title="Not referenced locally, nor via imports">QDollar4</span></span> = <a href="#StrategoLang-Dollar4_1758_1778" id="StrategoLang-Dollar4_900_920" title="Defined at line 35">StrategoLang-Dollar4</a> { }
  <a href="#StrategoLang-StringQuotedPart1_2434_2464" id="StrategoLang-StringQuotedPart1_927_957" title="Referenced at line 54">StrategoLang-StringQuotedPart1</a>.<span class="cons_Constructor"><span id="QBr1_958_962" title="Not referenced locally, nor via imports">QBr1</span></span> = <a href="#StrategoLang-QuotedBracket1_1791_1818" id="StrategoLang-QuotedBracket1_965_992" title="Defined at line 36">StrategoLang-QuotedBracket1</a> { }
  <a href="#StrategoLang-StringQuotedPart2_2538_2568" id="StrategoLang-StringQuotedPart2_999_1029" title="Referenced at line 55">StrategoLang-StringQuotedPart2</a>.<span class="cons_Constructor"><span id="QBr2_1030_1034" title="Not referenced locally, nor via imports">QBr2</span></span> = <a href="#StrategoLang-QuotedBracket2_1842_1869" id="StrategoLang-QuotedBracket2_1037_1064" title="Defined at line 37">StrategoLang-QuotedBracket2</a> { }
  <a href="#StrategoLang-StringQuotedPart3_2642_2672" id="StrategoLang-StringQuotedPart3_1071_1101" title="Referenced at line 56">StrategoLang-StringQuotedPart3</a>.<span class="cons_Constructor"><span id="QBr3_1102_1106" title="Not referenced locally, nor via imports">QBr3</span></span> = <a href="#StrategoLang-QuotedBracket3_1893_1920" id="StrategoLang-QuotedBracket3_1109_1136" title="Defined at line 38">StrategoLang-QuotedBracket3</a> { }
  <a href="#StrategoLang-StringQuotedPart4_2746_2776" id="StrategoLang-StringQuotedPart4_1143_1173" title="Referenced at line 57">StrategoLang-StringQuotedPart4</a>.<span class="cons_Constructor"><span id="QBr4_1174_1178" title="Not referenced locally, nor via imports">QBr4</span></span> = <a href="#StrategoLang-QuotedBracket4_1944_1971" id="StrategoLang-QuotedBracket4_1181_1208" title="Defined at line 39">StrategoLang-QuotedBracket4</a> { }

<span class="keyword">sorts</span> <span id="StringQuotedChars1_1220_1238" title="Not referenced locally, nor via imports">StringQuotedChars1</span><span class="keyword">-LEX</span> <span id="Dollar1_1243_1250" title="Not referenced locally, nor via imports">Dollar1</span><span class="keyword">-LEX</span> <span id="QuotedBracket1_1255_1269" title="Not referenced locally, nor via imports">QuotedBracket1</span><span class="keyword">-LEX</span> <span id="StringQuotedChars2_1274_1292" title="Not referenced locally, nor via imports">StringQuotedChars2</span><span class="keyword">-LEX</span> <span id="Dollar2_1297_1304" title="Not referenced locally, nor via imports">Dollar2</span><span class="keyword">-LEX</span> <span id="QuotedBracket2_1309_1323" title="Not referenced locally, nor via imports">QuotedBracket2</span><span class="keyword">-LEX</span> <span id="StringQuotedChars3_1328_1346" title="Not referenced locally, nor via imports">StringQuotedChars3</span><span class="keyword">-LEX</span> <span id="Dollar3_1351_1358" title="Not referenced locally, nor via imports">Dollar3</span><span class="keyword">-LEX</span> <span id="QuotedBracket3_1363_1377" title="Not referenced locally, nor via imports">QuotedBracket3</span><span class="keyword">-LEX</span> <span id="StringQuotedChars4_1382_1400" title="Not referenced locally, nor via imports">StringQuotedChars4</span><span class="keyword">-LEX</span> <span id="Dollar4_1405_1412" title="Not referenced locally, nor via imports">Dollar4</span><span class="keyword">-LEX</span> <span id="QuotedBracket4_1417_1431" title="Not referenced locally, nor via imports">QuotedBracket4</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-StringQuotedChars1_2018_2049" id="StrategoLang-StringQuotedChars1_1455_1486" title="Referenced at line 43">StrategoLang-StringQuotedChars1</a> = ~[\[\]\$]+ { }
  <a href="#StrategoLang-StringQuotedChars2_2066_2097" id="StrategoLang-StringQuotedChars2_1506_1537" title="Referenced at line 44">StrategoLang-StringQuotedChars2</a> = ~[\{\}\$]+ { }
  <a href="#StrategoLang-StringQuotedChars3_2114_2145" id="StrategoLang-StringQuotedChars3_1557_1588" title="Referenced at line 45">StrategoLang-StringQuotedChars3</a> = ~[\(\)\$]+ { }
  <a href="#StrategoLang-StringQuotedChars4_2162_2193" id="StrategoLang-StringQuotedChars4_1608_1639" title="Referenced at line 46">StrategoLang-StringQuotedChars4</a> = ~[\&lt;\&gt;\$]+ { }
  <a href="#StrategoLang-Dollar1_2210_2230" id="StrategoLang-Dollar1_1659_1679" title="Referenced at line 47">StrategoLang-Dollar1</a> = <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-Dollar2_2249_2269" id="StrategoLang-Dollar2_1692_1712" title="Referenced at line 48">StrategoLang-Dollar2</a> = <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-Dollar3_2288_2308" id="StrategoLang-Dollar3_1725_1745" title="Referenced at line 49">StrategoLang-Dollar3</a> = <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-Dollar4_2327_2347" id="StrategoLang-Dollar4_1758_1778" title="Referenced at line 50">StrategoLang-Dollar4</a> = <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-QuotedBracket1_965_992" id="StrategoLang-QuotedBracket1_1791_1818" title="Referenced at line 19">StrategoLang-QuotedBracket1</a> = <span class="cons_Lit">"$"</span> [\[\]] <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-QuotedBracket2_1037_1064" id="StrategoLang-QuotedBracket2_1842_1869" title="Referenced at line 20">StrategoLang-QuotedBracket2</a> = <span class="cons_Lit">"$"</span> [\{\}] <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-QuotedBracket3_1109_1136" id="StrategoLang-QuotedBracket3_1893_1920" title="Referenced at line 21">StrategoLang-QuotedBracket3</a> = <span class="cons_Lit">"$"</span> [\(\)] <span class="cons_Lit">"$"</span> { }
  <a href="#StrategoLang-QuotedBracket4_1181_1208" id="StrategoLang-QuotedBracket4_1944_1971" title="Referenced at line 22">StrategoLang-QuotedBracket4</a> = <span class="cons_Lit">"$"</span> [\&lt;\&gt;] <span class="cons_Lit">"$"</span> { }

<span class="keyword">lexical restrictions</span>

  <a href="#StrategoLang-StringQuotedChars1_1455_1486" id="StrategoLang-StringQuotedChars1_2018_2049" title="Defined at line 28">StrategoLang-StringQuotedChars1</a> -/- ~[\[\]\$]
  <a href="#StrategoLang-StringQuotedChars2_1506_1537" id="StrategoLang-StringQuotedChars2_2066_2097" title="Defined at line 29">StrategoLang-StringQuotedChars2</a> -/- ~[\{\}\$]
  <a href="#StrategoLang-StringQuotedChars3_1557_1588" id="StrategoLang-StringQuotedChars3_2114_2145" title="Defined at line 30">StrategoLang-StringQuotedChars3</a> -/- ~[\(\)\$]
  <a href="#StrategoLang-StringQuotedChars4_1608_1639" id="StrategoLang-StringQuotedChars4_2162_2193" title="Defined at line 31">StrategoLang-StringQuotedChars4</a> -/- ~[\&lt;\&gt;\$]
  <a href="#StrategoLang-Dollar1_1659_1679" id="StrategoLang-Dollar1_2210_2230" title="Defined at line 32">StrategoLang-Dollar1</a> -/- [\[\]].[\$]
  <a href="#StrategoLang-Dollar2_1692_1712" id="StrategoLang-Dollar2_2249_2269" title="Defined at line 33">StrategoLang-Dollar2</a> -/- [\{\}].[\$]
  <a href="#StrategoLang-Dollar3_1725_1745" id="StrategoLang-Dollar3_2288_2308" title="Defined at line 34">StrategoLang-Dollar3</a> -/- [\(\)].[\$]
  <a href="#StrategoLang-Dollar4_1758_1778" id="StrategoLang-Dollar4_2327_2347" title="Defined at line 35">StrategoLang-Dollar4</a> -/- [\&lt;\&gt;].[\$]

<span class="keyword">syntax</span>

  <a href="#StrategoLang-StringQuotation_308_336" id="StrategoLang-StringQuotation_2375_2403" title="Referenced at line 10">StrategoLang-StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation1_2407_2423" title="Not referenced locally, nor via imports">StringQuotation1</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"["</span> <a href="#StrategoLang-StringQuotedPart1_137_167" id="StrategoLang-StringQuotedPart1_2434_2464" title="Defined at line 6, 11, 15, 19, 58">StrategoLang-StringQuotedPart1</a><span class="keyword">-CF</span>* <span class="cons_Lit">"]"</span> { }
  <a href="#StrategoLang-StringQuotation_308_336" id="StrategoLang-StringQuotation_2479_2507" title="Referenced at line 10">StrategoLang-StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation2_2511_2527" title="Not referenced locally, nor via imports">StringQuotation2</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"{"</span> <a href="#StrategoLang-StringQuotedPart2_168_198" id="StrategoLang-StringQuotedPart2_2538_2568" title="Defined at line 6, 12, 16, 20, 59">StrategoLang-StringQuotedPart2</a><span class="keyword">-CF</span>* <span class="cons_Lit">"}"</span> { }
  <a href="#StrategoLang-StringQuotation_308_336" id="StrategoLang-StringQuotation_2583_2611" title="Referenced at line 10">StrategoLang-StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation3_2615_2631" title="Not referenced locally, nor via imports">StringQuotation3</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"("</span> <a href="#StrategoLang-StringQuotedPart3_199_229" id="StrategoLang-StringQuotedPart3_2642_2672" title="Defined at line 6, 13, 17, 21, 60">StrategoLang-StringQuotedPart3</a><span class="keyword">-CF</span>* <span class="cons_Lit">")"</span> { }
  <a href="#StrategoLang-StringQuotation_308_336" id="StrategoLang-StringQuotation_2687_2715" title="Referenced at line 10">StrategoLang-StringQuotation</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation4_2719_2735" title="Not referenced locally, nor via imports">StringQuotation4</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"&lt;"</span> <a href="#StrategoLang-StringQuotedPart4_230_260" id="StrategoLang-StringQuotedPart4_2746_2776" title="Defined at line 6, 14, 18, 22, 61">StrategoLang-StringQuotedPart4</a><span class="keyword">-CF</span>* <span class="cons_Lit">"&gt;"</span> { }
  <a href="#StrategoLang-StringQuotedPart1_2434_2464" id="StrategoLang-StringQuotedPart1_2791_2821" title="Referenced at line 54">StrategoLang-StringQuotedPart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape1_2825_2838" title="Not referenced locally, nor via imports">StringEscape1</span></span> = <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_2856_2873" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span> { }
  <a href="#StrategoLang-StringQuotedPart2_2538_2568" id="StrategoLang-StringQuotedPart2_2898_2928" title="Referenced at line 55">StrategoLang-StringQuotedPart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape2_2932_2945" title="Not referenced locally, nor via imports">StringEscape2</span></span> = <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_2963_2980" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span> { }
  <a href="#StrategoLang-StringQuotedPart3_2642_2672" id="StrategoLang-StringQuotedPart3_3005_3035" title="Referenced at line 56">StrategoLang-StringQuotedPart3</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape3_3039_3052" title="Not referenced locally, nor via imports">StringEscape3</span></span> = <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_3070_3087" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span> { }
  <a href="#StrategoLang-StringQuotedPart4_2746_2776" id="StrategoLang-StringQuotedPart4_3112_3142" title="Referenced at line 57">StrategoLang-StringQuotedPart4</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape4_3146_3159" title="Not referenced locally, nor via imports">StringEscape4</span></span> = <span class="cons_Lit">"&lt;"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_3177_3194" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"&gt;"</span> { }

<span class="keyword">sorts</span> <span id="StrategoLang-InternalStringQuotation_3224_3260" title="Not referenced locally, nor via imports">StrategoLang-InternalStringQuotation</span> <a href="#StrategoLang-InternalStringQuotedPart1_3520_3558" id="StrategoLang-InternalStringQuotedPart1_3261_3299" title="Referenced at line 67">StrategoLang-InternalStringQuotedPart1</a> <a href="#StrategoLang-InternalStringQuotedPart2_3665_3703" id="StrategoLang-InternalStringQuotedPart2_3300_3338" title="Referenced at line 68">StrategoLang-InternalStringQuotedPart2</a> <a href="#StrategoLang-InternalStringQuotedPart3_3810_3848" id="StrategoLang-InternalStringQuotedPart3_3339_3377" title="Referenced at line 69">StrategoLang-InternalStringQuotedPart3</a> <a href="#StrategoLang-InternalStringQuotedPart4_3955_3993" id="StrategoLang-InternalStringQuotedPart4_3378_3416" title="Referenced at line 70">StrategoLang-InternalStringQuotedPart4</a>

<span class="keyword">syntax</span>

  <span id="StrategoLang-InternalStringQuotation_3428_3464" title="Not referenced locally, nor via imports">StrategoLang-InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation1_3468_3484" title="Not referenced locally, nor via imports">StringQuotation1</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"["</span> <a href="#StrategoLang-Padding_4604_4624" id="StrategoLang-Padding_3495_3515" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <a href="#StrategoLang-InternalStringQuotedPart1_3261_3299" id="StrategoLang-InternalStringQuotedPart1_3520_3558" title="Defined at line 63, 71">StrategoLang-InternalStringQuotedPart1</a><span class="keyword">-CF</span>* <span class="cons_Lit">"]"</span> { }
  <span id="StrategoLang-InternalStringQuotation_3573_3609" title="Not referenced locally, nor via imports">StrategoLang-InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation2_3613_3629" title="Not referenced locally, nor via imports">StringQuotation2</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"{"</span> <a href="#StrategoLang-Padding_4604_4624" id="StrategoLang-Padding_3640_3660" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <a href="#StrategoLang-InternalStringQuotedPart2_3300_3338" id="StrategoLang-InternalStringQuotedPart2_3665_3703" title="Defined at line 63, 72">StrategoLang-InternalStringQuotedPart2</a><span class="keyword">-CF</span>* <span class="cons_Lit">"}"</span> { }
  <span id="StrategoLang-InternalStringQuotation_3718_3754" title="Not referenced locally, nor via imports">StrategoLang-InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation3_3758_3774" title="Not referenced locally, nor via imports">StringQuotation3</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"("</span> <a href="#StrategoLang-Padding_4604_4624" id="StrategoLang-Padding_3785_3805" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <a href="#StrategoLang-InternalStringQuotedPart3_3339_3377" id="StrategoLang-InternalStringQuotedPart3_3810_3848" title="Defined at line 63, 73">StrategoLang-InternalStringQuotedPart3</a><span class="keyword">-CF</span>* <span class="cons_Lit">")"</span> { }
  <span id="StrategoLang-InternalStringQuotation_3863_3899" title="Not referenced locally, nor via imports">StrategoLang-InternalStringQuotation</span><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringQuotation4_3903_3919" title="Not referenced locally, nor via imports">StringQuotation4</span></span> = <span class="cons_Lit">"$"</span> <span class="cons_Lit">"&lt;"</span> <a href="#StrategoLang-Padding_4604_4624" id="StrategoLang-Padding_3930_3950" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <a href="#StrategoLang-InternalStringQuotedPart4_3378_3416" id="StrategoLang-InternalStringQuotedPart4_3955_3993" title="Defined at line 63, 74">StrategoLang-InternalStringQuotedPart4</a><span class="keyword">-CF</span>* <span class="cons_Lit">"&gt;"</span> { }
  <a href="#StrategoLang-InternalStringQuotedPart1_3520_3558" id="StrategoLang-InternalStringQuotedPart1_4008_4046" title="Referenced at line 67">StrategoLang-InternalStringQuotedPart1</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape1_4050_4063" title="Not referenced locally, nor via imports">StringEscape1</span></span> = <a href="#StrategoLang-Padding_4604_4624" id="StrategoLang-Padding_4066_4086" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"["</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_4106_4123" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"]"</span> { }
  <a href="#StrategoLang-InternalStringQuotedPart2_3665_3703" id="StrategoLang-InternalStringQuotedPart2_4148_4186" title="Referenced at line 68">StrategoLang-InternalStringQuotedPart2</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape2_4190_4203" title="Not referenced locally, nor via imports">StringEscape2</span></span> = <a href="#StrategoLang-Padding_4604_4624" id="StrategoLang-Padding_4206_4226" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"{"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_4246_4263" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"}"</span> { }
  <a href="#StrategoLang-InternalStringQuotedPart3_3810_3848" id="StrategoLang-InternalStringQuotedPart3_4288_4326" title="Referenced at line 69">StrategoLang-InternalStringQuotedPart3</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape3_4330_4343" title="Not referenced locally, nor via imports">StringEscape3</span></span> = <a href="#StrategoLang-Padding_4604_4624" id="StrategoLang-Padding_4346_4366" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"("</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_4386_4403" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">")"</span> { }
  <a href="#StrategoLang-InternalStringQuotedPart4_3955_3993" id="StrategoLang-InternalStringQuotedPart4_4428_4466" title="Referenced at line 70">StrategoLang-InternalStringQuotedPart4</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="StringEscape4_4470_4483" title="Not referenced locally, nor via imports">StringEscape4</span></span> = <a href="#StrategoLang-Padding_4604_4624" id="StrategoLang-Padding_4486_4506" title="Defined at line 80">StrategoLang-Padding</a><span class="keyword">-LEX</span> <span class="cons_Lit">"&lt;"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_4526_4543" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"&gt;"</span> { }

<span class="keyword">sorts</span> <span id="Padding_4573_4580" title="Not referenced locally, nor via imports">Padding</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-Padding_4486_4506" id="StrategoLang-Padding_4604_4624" title="Referenced at line 74">StrategoLang-Padding</a> = <span class="cons_CiLit">' '</span>+ { }

</code></pre></td></tr></tbody></table></div>