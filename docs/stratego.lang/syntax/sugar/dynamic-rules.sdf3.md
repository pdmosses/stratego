---
title: dynamic-rules.sdf3
hide:
  - toc
---

# `dynamic-rules.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/sugar/dynamic-rules.sdf3]

[pdmosses/stratego/stratego.lang/syntax/sugar/dynamic-rules.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/sugar/dynamic-rules.sdf3 "The source file on GitHub"

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
98
99
100
101
102
103
104
105
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.sdf3#sugar/dynamic-rules_164_183" id="sugar/dynamic-rules_7_26" title="Referenced at ../main.sdf3 line 13">sugar/dynamic-rules</a>

<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_38_54" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/terms.sdf3#core/terms_7_17" id="core/terms_57_67" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>
  <a href="../../core/signatures.sdf3#core/signatures_7_22" id="core/signatures_70_85" title="Defined at ../../core/signatures.sdf3 line 1">core/signatures</a>
  <a href="../../core/strategies.sdf3#core/strategies_7_22" id="core/strategies_88_103" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../strategies.sdf3#sugar/strategies_7_23" id="sugar/strategies_106_122" title="Defined at ../strategies.sdf3 line 1">sugar/strategies</a>
  <a href="../rules.sdf3#sugar/rules_7_18" id="sugar/rules_125_136" title="Defined at ../rules.sdf3 line 1">sugar/rules</a>

<span class="keyword">template options</span>
  <span class="keyword">tokenize</span>: ")("

<span class="keyword">context-free sorts</span> <a href="#ScopeLabels_255_266" id="ScopeLabels_192_203" title="Referenced at line 17">ScopeLabels</a>
<span class="keyword">context-free syntax</span>
  <a href="#Strategy_2671_2679" id="Strategy_226_234" title="Referenced at line 105">Strategy</a>.<span class="cons_Constructor"><span id="DynRuleScope_235_247" title="Not referenced locally, nor via imports">DynRuleScope</span></span> =
&lt;<span class="cons_String">{|</span> &lt;<a href="#ScopeLabels_192_203" id="ScopeLabels_255_266" title="Defined at line 14, 21, 23">ScopeLabels</a>&gt;
<span class="cons_String">:</span> &lt;<a href="#Strategy_226_234" id="Strategy_271_279" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt;
<span class="cons_String">|}</span>&gt;

  <a href="#ScopeLabels_255_266" id="ScopeLabels_288_299" title="Referenced at line 17">ScopeLabels</a> = {<a href="#DynRuleScopeId_405_419" id="DynRuleScopeId_303_317" title="Defined at line 25, 51, 53">DynRuleScopeId</a> <span class="cons_Lit">", "</span>}*

  <a href="#ScopeLabels_255_266" id="ScopeLabels_328_339" title="Referenced at line 17">ScopeLabels</a>.<span class="cons_Constructor"><span id="ScopeLabels_340_351" title="Not referenced locally, nor via imports">ScopeLabels</span></span> = &lt;<span class="cons_String">~</span>&lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_357_361" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;

<span class="keyword">context-free sorts</span> <a href="#DynRuleDef_478_488" id="DynRuleDef_384_394" title="Referenced at line 29">DynRuleDef</a> <a href="#DynRuleId_924_933" id="DynRuleId_395_404" title="Referenced at line 45">DynRuleId</a> <a href="#DynRuleScopeId_303_317" id="DynRuleScopeId_405_419" title="Referenced at line 21">DynRuleScopeId</a>
<span class="keyword">context-free syntax</span>

  <a href="#Strategy_2671_2679" id="Strategy_443_451" title="Referenced at line 105">Strategy</a>.<span class="cons_Constructor"><span id="GenDynRules_452_463" title="Not referenced locally, nor via imports">GenDynRules</span></span> =
    &lt;<span class="cons_String">rules(</span>&lt;<a href="#DynRuleDef_384_394" id="DynRuleDef_478_488" title="Defined at line 25, 30, 32, 34, 36, 38, 40, 42, 44">DynRuleDef</a>*&gt;<span class="cons_String">)</span>&gt;
  <a href="#DynRuleDef_478_488" id="DynRuleDef_495_505" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="AddScopeLabel_506_519" title="Not referenced locally, nor via imports">AddScopeLabel</span></span> =
    &lt;&lt;<a href="../../core/strategies.sdf3#SId_686_689" id="SId_528_531" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt; <span class="cons_String">+</span> &lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_536_540" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleDef_478_488" id="DynRuleDef_545_555" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="UndefineDynRule_556_571" title="Not referenced locally, nor via imports">UndefineDynRule</span></span> =
    &lt;&lt;<a href="#DynRuleId_395_404" id="DynRuleId_580_589" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:-</span> &lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_595_599" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleDef_478_488" id="DynRuleDef_604_614" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="SetDynRule_615_625" title="Not referenced locally, nor via imports">SetDynRule</span></span> =
    &lt;&lt;<a href="#DynRuleId_395_404" id="DynRuleId_634_643" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:</span> &lt;<a href="../rules.sdf3#Rule_664_668" id="Rule_648_652" title="Defined at ../rules.sdf3 line 39, 42">Rule</a>&gt;&gt;
  <a href="#DynRuleDef_478_488" id="DynRuleDef_657_667" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="AddDynRule_668_678" title="Not referenced locally, nor via imports">AddDynRule</span></span> =
    &lt;&lt;<a href="#DynRuleId_395_404" id="DynRuleId_687_696" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:+</span> &lt;<a href="../rules.sdf3#Rule_664_668" id="Rule_702_706" title="Defined at ../rules.sdf3 line 39, 42">Rule</a>&gt;&gt;
  <a href="#DynRuleDef_478_488" id="DynRuleDef_711_721" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="SetDynRuleMatch_722_737" title="Not referenced locally, nor via imports">SetDynRuleMatch</span></span> =
    &lt;&lt;<a href="#DynRuleId_395_404" id="DynRuleId_746_755" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:</span> &lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_760_764" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleDef_478_488" id="DynRuleDef_769_779" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="DynRuleAssign_780_793" title="Not referenced locally, nor via imports">DynRuleAssign</span></span> =
    &lt;&lt;<a href="#DynRuleId_395_404" id="DynRuleId_802_811" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:=</span> &lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_817_821" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleDef_478_488" id="DynRuleDef_826_836" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="DynRuleAssignAdd_837_853" title="Not referenced locally, nor via imports">DynRuleAssignAdd</span></span> =
    &lt;&lt;<a href="#DynRuleId_395_404" id="DynRuleId_862_871" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:+=</span> &lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_878_882" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleDef_478_488" id="DynRuleDef_887_897" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="SetDynRuleDepends_898_915" title="Not referenced locally, nor via imports">SetDynRuleDepends</span></span> =
    &lt;&lt;<a href="#DynRuleId_395_404" id="DynRuleId_924_933" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:</span> &lt;<a href="../rules.sdf3#Rule_664_668" id="Rule_938_942" title="Defined at ../rules.sdf3 line 39, 42">Rule</a>&gt; <span class="cons_String">depends</span> <span class="cons_String">on</span> &lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_956_960" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleId_924_933" id="DynRuleId_965_974" title="Referenced at line 45">DynRuleId</a>.<span class="cons_Constructor"><span id="LabeledDynRuleId_975_991" title="Not referenced locally, nor via imports">LabeledDynRuleId</span></span> =
    &lt;&lt;<a href="#RuleDec_1226_1233" id="RuleDec_1000_1007" title="Defined at line 55, 58, 59, 60">RuleDec</a>&gt; <span class="cons_String">.</span> &lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_1012_1016" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleId_924_933" id="DynRuleId_1021_1030" title="Referenced at line 45">DynRuleId</a>.<span class="cons_Constructor"><span id="AddLabelDynRuleId_1031_1048" title="Not referenced locally, nor via imports">AddLabelDynRuleId</span></span> =
    &lt;&lt;<a href="#RuleDec_1226_1233" id="RuleDec_1057_1064" title="Defined at line 55, 58, 59, 60">RuleDec</a>&gt; <span class="cons_String">+</span> &lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_1069_1073" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleId_924_933" id="DynRuleId_1078_1087" title="Referenced at line 45">DynRuleId</a>.<span class="cons_Constructor"><span id="DynRuleId_1088_1097" title="Not referenced locally, nor via imports">DynRuleId</span></span> = <a href="#RuleDec_1226_1233" id="RuleDec_1100_1107" title="Defined at line 55, 58, 59, 60">RuleDec</a>
  <a href="#DynRuleScopeId_303_317" id="DynRuleScopeId_1110_1124" title="Referenced at line 21">DynRuleScopeId</a>.<span class="cons_Constructor"><span id="LabeledDynRuleScopeId_1125_1146" title="Not referenced locally, nor via imports">LabeledDynRuleScopeId</span></span> =
    &lt;&lt;<a href="../../core/identifiers.sdf3#Id_420_422" id="Id_1155_1157" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt; <span class="cons_String">.</span> &lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_1162_1166" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleScopeId_303_317" id="DynRuleScopeId_1171_1185" title="Referenced at line 21">DynRuleScopeId</a>.<span class="cons_Constructor"><span id="DynRuleScopeId_1186_1200" title="Not referenced locally, nor via imports">DynRuleScopeId</span></span> = <a href="../../core/identifiers.sdf3#Id_420_422" id="Id_1203_1205" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>

<span class="keyword">context-free sorts</span> <a href="#RuleDec_1100_1107" id="RuleDec_1226_1233" title="Referenced at line 50">RuleDec</a>
<span class="keyword">context-free syntax</span>

  <a href="#RuleDec_1100_1107" id="RuleDec_1257_1264" title="Referenced at line 50">RuleDec</a>.<span class="cons_Constructor"><span id="RDecNoArgs_1265_1275" title="Not referenced locally, nor via imports">RDecNoArgs</span></span> = <a href="../../core/strategies.sdf3#SId_686_689" id="SId_1278_1281" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>
  <a href="#RuleDec_1100_1107" id="RuleDec_1284_1291" title="Referenced at line 50">RuleDec</a>.<span class="cons_Constructor"><span id="RDec_1292_1296" title="Not referenced locally, nor via imports">RDec</span></span> = &lt;&lt;<a href="../../core/strategies.sdf3#SId_686_689" id="SId_1301_1304" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies.sdf3#Typedid_953_960" id="Typedid_1308_1315" title="Defined at ../../core/strategies.sdf3 line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">)</span>&gt;
  <a href="#RuleDec_1100_1107" id="RuleDec_1329_1336" title="Referenced at line 50">RuleDec</a>.<span class="cons_Constructor"><span id="RDecT_1337_1342" title="Not referenced locally, nor via imports">RDecT</span></span> = &lt;&lt;<a href="../../core/strategies.sdf3#SId_686_689" id="SId_1347_1350" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies.sdf3#Typedid_953_960" id="Typedid_1354_1361" title="Defined at ../../core/strategies.sdf3 line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="../../core/strategies.sdf3#Typedid_953_960" id="Typedid_1374_1381" title="Defined at ../../core/strategies.sdf3 line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">context-free sorts</span> <a href="#RuleNames_2418_2427" id="RuleNames_1412_1421" title="Referenced at line 96; ../../deduplicated.sdf3 line 51">RuleNames</a>
<span class="keyword">context-free syntax</span>

  <a href="#RuleNames_2418_2427" id="RuleNames_1445_1454" title="Referenced at line 96; ../../deduplicated.sdf3 line 51">RuleNames</a> = {<a href="../../core/strategies.sdf3#SId_686_689" id="SId_1458_1461" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a> <span class="cons_Lit">", "</span>}*
  <a href="#RuleNames_2418_2427" id="RuleNames_1471_1480" title="Referenced at line 96; ../../deduplicated.sdf3 line 51">RuleNames</a>.<span class="cons_Constructor"><span id="RuleNames_1481_1490" title="Not referenced locally, nor via imports">RuleNames</span></span> = &lt;<span class="cons_String">~</span>&lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_1496_1500" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#Strategy_2671_2679" id="Strategy_1505_1513" title="Referenced at line 105">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectFix_2508_2527" id="DynRuleIntersectFix_1514_1533" title="Referenced at line 100">DynRuleIntersectFix</a></span> = &lt;<span class="cons_String">/</span>&lt;<a href="#RuleNames_1412_1421" id="RuleNames_1539_1548" title="Defined at line 62, 65, 66">RuleNames</a>&gt;\\<span class="cons_String">*</span> &lt;<a href="#Strategy_226_234" id="Strategy_1554_1562" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt;&gt;

<span class="keyword">syntax</span>
  <span class="layout">// no space after RuleNames</span>
  <a href="#Strategy_2671_2679" id="Strategy_1605_1613" title="Referenced at line 105">Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><a href="#DynRuleUnionFix_2537_2552" id="DynRuleUnionFix_1617_1632" title="Referenced at line 100">DynRuleUnionFix</a></span> =
  <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#RuleNames_1412_1421" id="RuleNames_1653_1662" title="Defined at line 62, 65, 66">RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">"/*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Strategy_226_234" id="Strategy_1682_1690" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a><span class="keyword">-CF</span>


  <span class="layout">// 1 space after RuleNames</span>
  <a href="#Strategy_2671_2679" id="Strategy_1727_1735" title="Referenced at line 105">Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleUnionFix1_1739_1755" title="Not referenced locally, nor via imports">DynRuleUnionFix1</span></span> =
  <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#RuleNames_1412_1421" id="RuleNames_1776_1785" title="Defined at line 62, 65, 66">RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Strategy_226_234" id="Strategy_1806_1814" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a><span class="keyword">-CF</span>

  <span class="layout">// no space after RuleNames</span>
  <a href="#Strategy_2671_2679" id="Strategy_1851_1859" title="Referenced at line 105">Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleIntersectUnionFix_1863_1887" title="Not referenced locally, nor via imports">DynRuleIntersectUnionFix</span></span> =
  <span class="cons_Lit">"/"</span>  <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#RuleNames_1412_1421" id="RuleNames_1908_1917" title="Defined at line 62, 65, 66">RuleNames</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"\\"</span>
      <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#RuleNames_1412_1421" id="RuleNames_1954_1963" title="Defined at line 62, 65, 66">RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">"/*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Strategy_226_234" id="Strategy_1983_1991" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a><span class="keyword">-CF</span>

  <span class="layout">// 1 space after RuleNames</span>
  <a href="#Strategy_2671_2679" id="Strategy_2027_2035" title="Referenced at line 105">Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleIntersectUnionFix1_2039_2064" title="Not referenced locally, nor via imports">DynRuleIntersectUnionFix1</span></span> =
  <span class="cons_Lit">"/"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#RuleNames_1412_1421" id="RuleNames_2084_2093" title="Defined at line 62, 65, 66">RuleNames</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"\\"</span>
      <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#RuleNames_1412_1421" id="RuleNames_2130_2139" title="Defined at line 62, 65, 66">RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Strategy_226_234" id="Strategy_2160_2168" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a><span class="keyword">-CF</span>

<span class="keyword">context-free syntax</span>

  <a href="#Strategy_2671_2679" id="Strategy_2196_2204" title="Referenced at line 105">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersect_2586_2602" id="DynRuleIntersect_2205_2221" title="Referenced at line 102">DynRuleIntersect</a></span> =
    &lt;&lt;<a href="#Strategy_226_234" id="Strategy_2230_2238" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt; <span class="cons_String">/</span>&lt;<a href="#RuleNames_1412_1421" id="RuleNames_2242_2251" title="Defined at line 62, 65, 66">RuleNames</a>&gt;\\ &lt;<a href="#Strategy_226_234" id="Strategy_2256_2264" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#Strategy_2671_2679" id="Strategy_2277_2285" title="Referenced at line 105">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleUnion_2617_2629" id="DynRuleUnion_2286_2298" title="Referenced at line 103">DynRuleUnion</a></span> =
    &lt;&lt;<a href="#Strategy_226_234" id="Strategy_2307_2315" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt; \\&lt;<a href="#RuleNames_1412_1421" id="RuleNames_2320_2329" title="Defined at line 62, 65, 66">RuleNames</a>&gt;<span class="cons_String">/</span> &lt;<a href="#Strategy_226_234" id="Strategy_2333_2341" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#Strategy_2671_2679" id="Strategy_2354_2362" title="Referenced at line 105">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectUnion_2644_2665" id="DynRuleIntersectUnion_2363_2384" title="Referenced at line 104">DynRuleIntersectUnion</a></span> =
    &lt;&lt;<a href="#Strategy_226_234" id="Strategy_2393_2401" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt; <span class="cons_String">/</span>&lt;<a href="#RuleNames_1412_1421" id="RuleNames_2405_2414" title="Defined at line 62, 65, 66">RuleNames</a>&gt;\\&lt;<a href="#RuleNames_1412_1421" id="RuleNames_2418_2427" title="Defined at line 62, 65, 66">RuleNames</a>&gt;<span class="cons_String">/</span> &lt;<a href="#Strategy_226_234" id="Strategy_2431_2439" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt;&gt; {<span class="keyword">right</span>}

<span class="keyword">context-free priorities</span>
     <a href="#Strategy_226_234" id="Strategy_2480_2488" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="../strategies.sdf3#BA_778_780" id="BA_2489_2491" title="Defined at ../strategies.sdf3 line 42">BA</a></span>
   &gt; { <a href="#Strategy_226_234" id="Strategy_2499_2507" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectFix_1514_1533" id="DynRuleIntersectFix_2508_2527" title="Defined at line 67">DynRuleIntersectFix</a></span> <a href="#Strategy_226_234" id="Strategy_2528_2536" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleUnionFix_1617_1632" id="DynRuleUnionFix_2537_2552" title="Defined at line 71">DynRuleUnionFix</a></span> }
   &gt; <a href="#Strategy_226_234" id="Strategy_2560_2568" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="../strategies.sdf3#AM_1819_1821" id="AM_2569_2571" title="Defined at ../strategies.sdf3 line 67">AM</a></span>
   &gt; <a href="#Strategy_226_234" id="Strategy_2577_2585" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersect_2205_2221" id="DynRuleIntersect_2586_2602" title="Defined at line 91">DynRuleIntersect</a></span>
   &gt; <a href="#Strategy_226_234" id="Strategy_2608_2616" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleUnion_2286_2298" id="DynRuleUnion_2617_2629" title="Defined at line 93">DynRuleUnion</a></span>
   &gt; <a href="#Strategy_226_234" id="Strategy_2635_2643" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectUnion_2363_2384" id="DynRuleIntersectUnion_2644_2665" title="Defined at line 95">DynRuleIntersectUnion</a></span>
   &gt; <a href="#Strategy_226_234" id="Strategy_2671_2679" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3#Seq_1346_1349" id="Seq_2680_2683" title="Defined at ../../core/strategies.sdf3 line 62">Seq</a></span>


</code></pre></td></tr></tbody></table></div>