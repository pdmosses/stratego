---
title: dynamic-rules-namespaced.sdf3
hide:
  - toc
---

# `dynamic-rules-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/dynamic-rules-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/dynamic-rules-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main-namespaced.sdf3#StrategoLang/sugar/dynamic-rules-namespaced_387_430" id="StrategoLang/sugar/dynamic-rules-namespaced_7_50" title="Referenced at ../main-namespaced.sdf3 line 12">StrategoLang/sugar/dynamic-rules-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_62_102" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/terms-namespaced.sdf3#StrategoLang/core/terms-namespaced_7_41" id="StrategoLang/core/terms-namespaced_106_140" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>        
  <a href="../../core/signatures-namespaced.sdf3#StrategoLang/core/signatures-namespaced_7_46" id="StrategoLang/core/signatures-namespaced_144_183" title="Defined at ../../core/signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>        
  <a href="../../core/strategies-namespaced.sdf3#StrategoLang/core/strategies-namespaced_7_46" id="StrategoLang/core/strategies-namespaced_187_226" title="Defined at ../../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../strategies-namespaced.sdf3#StrategoLang/sugar/strategies-namespaced_7_47" id="StrategoLang/sugar/strategies-namespaced_230_270" title="Defined at ../strategies-namespaced.sdf3 line 1">StrategoLang/sugar/strategies-namespaced</a>        
  <a href="../rules-namespaced.sdf3#StrategoLang/sugar/rules-namespaced_7_42" id="StrategoLang/sugar/rules-namespaced_274_309" title="Defined at ../rules-namespaced.sdf3 line 1">StrategoLang/sugar/rules-namespaced</a>

<span class="keyword">template options</span>

  <span class="keyword">tokenize</span> : ")("

<span class="keyword">sorts</span> <a href="#StrategoLang-ScopeLabels_445_469" id="StrategoLang-ScopeLabels_354_378" title="Referenced at line 19">StrategoLang-ScopeLabels</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_4050_4071" id="StrategoLang-Strategy_403_424" title="Referenced at line 76">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="DynRuleScope_425_437" title="Not referenced locally, nor via imports">DynRuleScope</span></span> = &lt;<span class="cons_String">{|</span> &lt;<a href="#StrategoLang-ScopeLabels_354_378" id="StrategoLang-ScopeLabels_445_469" title="Defined at line 15, 22, 23">StrategoLang-ScopeLabels</a>&gt;
<span class="cons_String">:</span> &lt;<a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_474_495" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt;
<span class="cons_String">|}</span>&gt; { }
  <a href="#StrategoLang-ScopeLabels_445_469" id="StrategoLang-ScopeLabels_507_531" title="Referenced at line 19">StrategoLang-ScopeLabels</a> = {<a href="#StrategoLang-DynRuleScopeId_696_723" id="StrategoLang-DynRuleScopeId_535_562" title="Defined at line 25, 41, 42">StrategoLang-DynRuleScopeId</a> <span class="cons_Lit">", "</span>}* { }
  <a href="#StrategoLang-ScopeLabels_445_469" id="StrategoLang-ScopeLabels_576_600" title="Referenced at line 19">StrategoLang-ScopeLabels</a>.<span class="cons_Constructor"><span id="ScopeLabels_601_612" title="Not referenced locally, nor via imports">ScopeLabels</span></span> = &lt;<span class="cons_String">~</span>&lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_618_635" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-DynRuleDef_792_815" id="StrategoLang-DynRuleDef_649_672" title="Referenced at line 29">StrategoLang-DynRuleDef</a> <a href="#StrategoLang-DynRuleId_1537_1559" id="StrategoLang-DynRuleId_673_695" title="Referenced at line 37">StrategoLang-DynRuleId</a> <a href="#StrategoLang-DynRuleScopeId_535_562" id="StrategoLang-DynRuleScopeId_696_723" title="Referenced at line 22">StrategoLang-DynRuleScopeId</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_4050_4071" id="StrategoLang-Strategy_748_769" title="Referenced at line 76">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="GenDynRules_770_781" title="Not referenced locally, nor via imports">GenDynRules</span></span> = &lt;<span class="cons_String">rules(</span>&lt;<a href="#StrategoLang-DynRuleDef_649_672" id="StrategoLang-DynRuleDef_792_815" title="Defined at line 25, 30, 31, 32, 33, 34, 35, 36, 37">StrategoLang-DynRuleDef</a>*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-DynRuleDef_792_815" id="StrategoLang-DynRuleDef_826_849" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="AddScopeLabel_850_863" title="Not referenced locally, nor via imports">AddScopeLabel</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_868_884" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt; <span class="cons_String">+</span> &lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_889_906" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_792_815" id="StrategoLang-DynRuleDef_915_938" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="UndefineDynRule_939_954" title="Not referenced locally, nor via imports">UndefineDynRule</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_673_695" id="StrategoLang-DynRuleId_959_981" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:-</span> &lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_987_1004" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_792_815" id="StrategoLang-DynRuleDef_1013_1036" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="SetDynRule_1037_1047" title="Not referenced locally, nor via imports">SetDynRule</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_673_695" id="StrategoLang-DynRuleId_1052_1074" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:</span> &lt;StrategoLang-Rule&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_792_815" id="StrategoLang-DynRuleDef_1105_1128" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="AddDynRule_1129_1139" title="Not referenced locally, nor via imports">AddDynRule</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_673_695" id="StrategoLang-DynRuleId_1144_1166" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:+</span> &lt;StrategoLang-Rule&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_792_815" id="StrategoLang-DynRuleDef_1198_1221" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="SetDynRuleMatch_1222_1237" title="Not referenced locally, nor via imports">SetDynRuleMatch</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_673_695" id="StrategoLang-DynRuleId_1242_1264" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:</span> &lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_1269_1286" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_792_815" id="StrategoLang-DynRuleDef_1295_1318" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="DynRuleAssign_1319_1332" title="Not referenced locally, nor via imports">DynRuleAssign</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_673_695" id="StrategoLang-DynRuleId_1337_1359" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:=</span> &lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_1365_1382" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_792_815" id="StrategoLang-DynRuleDef_1391_1414" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="DynRuleAssignAdd_1415_1431" title="Not referenced locally, nor via imports">DynRuleAssignAdd</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_673_695" id="StrategoLang-DynRuleId_1436_1458" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:+=</span> &lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_1465_1482" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_792_815" id="StrategoLang-DynRuleDef_1491_1514" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="SetDynRuleDepends_1515_1532" title="Not referenced locally, nor via imports">SetDynRuleDepends</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_673_695" id="StrategoLang-DynRuleId_1537_1559" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:</span> &lt;StrategoLang-Rule&gt; <span class="cons_String">depends</span> <span class="cons_String">on</span> &lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_1595_1612" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleId_1537_1559" id="StrategoLang-DynRuleId_1621_1643" title="Referenced at line 37">StrategoLang-DynRuleId</a>.<span class="cons_Constructor"><span id="LabeledDynRuleId_1644_1660" title="Not referenced locally, nor via imports">LabeledDynRuleId</span></span> = &lt;&lt;<a href="#StrategoLang-RuleDec_2046_2066" id="StrategoLang-RuleDec_1665_1685" title="Defined at line 44, 48, 49, 50">StrategoLang-RuleDec</a>&gt; <span class="cons_String">.</span> &lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_1690_1707" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleId_1537_1559" id="StrategoLang-DynRuleId_1716_1738" title="Referenced at line 37">StrategoLang-DynRuleId</a>.<span class="cons_Constructor"><span id="AddLabelDynRuleId_1739_1756" title="Not referenced locally, nor via imports">AddLabelDynRuleId</span></span> = &lt;&lt;<a href="#StrategoLang-RuleDec_2046_2066" id="StrategoLang-RuleDec_1761_1781" title="Defined at line 44, 48, 49, 50">StrategoLang-RuleDec</a>&gt; <span class="cons_String">+</span> &lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_1786_1803" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleId_1537_1559" id="StrategoLang-DynRuleId_1812_1834" title="Referenced at line 37">StrategoLang-DynRuleId</a>.<span class="cons_Constructor"><span id="DynRuleId_1835_1844" title="Not referenced locally, nor via imports">DynRuleId</span></span> = <a href="#StrategoLang-RuleDec_2046_2066" id="StrategoLang-RuleDec_1847_1867" title="Defined at line 44, 48, 49, 50">StrategoLang-RuleDec</a> { }
  <a href="#StrategoLang-DynRuleScopeId_535_562" id="StrategoLang-DynRuleScopeId_1874_1901" title="Referenced at line 22">StrategoLang-DynRuleScopeId</a>.<span class="cons_Constructor"><span id="LabeledDynRuleScopeId_1902_1923" title="Not referenced locally, nor via imports">LabeledDynRuleScopeId</span></span> = &lt;&lt;<a href="../../core/identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_1928_1943" title="Defined at ../../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt; <span class="cons_String">.</span> &lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_1948_1965" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleScopeId_535_562" id="StrategoLang-DynRuleScopeId_1974_2001" title="Referenced at line 22">StrategoLang-DynRuleScopeId</a>.<span class="cons_Constructor"><span id="DynRuleScopeId_2002_2016" title="Not referenced locally, nor via imports">DynRuleScopeId</span></span> = <a href="../../core/identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_2019_2034" title="Defined at ../../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a> { }

<span class="keyword">sorts</span> <a href="#StrategoLang-RuleDec_1847_1867" id="StrategoLang-RuleDec_2046_2066" title="Referenced at line 40">StrategoLang-RuleDec</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-RuleDec_1847_1867" id="StrategoLang-RuleDec_2091_2111" title="Referenced at line 40">StrategoLang-RuleDec</a>.<span class="cons_Constructor"><span id="RDecNoArgs_2112_2122" title="Not referenced locally, nor via imports">RDecNoArgs</span></span> = <a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_2125_2141" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a> { }
  <a href="#StrategoLang-RuleDec_1847_1867" id="StrategoLang-RuleDec_2148_2168" title="Referenced at line 40">StrategoLang-RuleDec</a>.<span class="cons_Constructor"><span id="RDec_2169_2173" title="Not referenced locally, nor via imports">RDec</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_2178_2194" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies-namespaced.sdf3#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_2198_2218" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-RuleDec_1847_1867" id="StrategoLang-RuleDec_2236_2256" title="Referenced at line 40">StrategoLang-RuleDec</a>.<span class="cons_Constructor"><span id="RDecT_2257_2262" title="Not referenced locally, nor via imports">RDecT</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_2267_2283" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies-namespaced.sdf3#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_2287_2307" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="../../core/strategies-namespaced.sdf3#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_2320_2340" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-RuleNames_3672_3694" id="StrategoLang-RuleNames_2362_2384" title="Referenced at line 71">StrategoLang-RuleNames</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-RuleNames_3672_3694" id="StrategoLang-RuleNames_2409_2431" title="Referenced at line 71">StrategoLang-RuleNames</a> = {<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_2435_2451" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a> <span class="cons_Lit">", "</span>}* { }
  <a href="#StrategoLang-RuleNames_3672_3694" id="StrategoLang-RuleNames_2465_2487" title="Referenced at line 71">StrategoLang-RuleNames</a>.<span class="cons_Constructor"><span id="RuleNames_2488_2497" title="Not referenced locally, nor via imports">RuleNames</span></span> = &lt;<span class="cons_String">~</span>&lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_2503_2520" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-Strategy_4050_4071" id="StrategoLang-Strategy_2529_2550" title="Referenced at line 76">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectFix_3808_3827" id="DynRuleIntersectFix_2551_2570" title="Referenced at line 75">DynRuleIntersectFix</a></span> = &lt;<span class="cons_String">/</span>&lt;<a href="#StrategoLang-RuleNames_2362_2384" id="StrategoLang-RuleNames_2576_2598" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a>&gt;\\<span class="cons_String">*</span> &lt;<a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_2604_2625" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt;&gt; { }

<span class="keyword">syntax</span>

  <a href="#StrategoLang-Strategy_4050_4071" id="StrategoLang-Strategy_2643_2664" title="Referenced at line 76">StrategoLang-Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><a href="#DynRuleUnionFix_3880_3895" id="DynRuleUnionFix_2668_2683" title="Referenced at line 76">DynRuleUnionFix</a></span> = <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-RuleNames_2362_2384" id="StrategoLang-RuleNames_2702_2724" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">"/*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_2744_2765" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a><span class="keyword">-CF</span> { }
  <a href="#StrategoLang-Strategy_4050_4071" id="StrategoLang-Strategy_2775_2796" title="Referenced at line 76">StrategoLang-Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleUnionFix1_2800_2816" title="Not referenced locally, nor via imports">DynRuleUnionFix1</span></span> = <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-RuleNames_2362_2384" id="StrategoLang-RuleNames_2835_2857" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_2878_2899" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a><span class="keyword">-CF</span> { }
  <a href="#StrategoLang-Strategy_4050_4071" id="StrategoLang-Strategy_2909_2930" title="Referenced at line 76">StrategoLang-Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleIntersectUnionFix_2934_2958" title="Not referenced locally, nor via imports">DynRuleIntersectUnionFix</span></span> = <span class="cons_Lit">"/"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-RuleNames_2362_2384" id="StrategoLang-RuleNames_2976_2998" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-RuleNames_2362_2384" id="StrategoLang-RuleNames_3029_3051" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">"/*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3071_3092" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a><span class="keyword">-CF</span> { }
  <a href="#StrategoLang-Strategy_4050_4071" id="StrategoLang-Strategy_3102_3123" title="Referenced at line 76">StrategoLang-Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleIntersectUnionFix1_3127_3152" title="Not referenced locally, nor via imports">DynRuleIntersectUnionFix1</span></span> = <span class="cons_Lit">"/"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-RuleNames_2362_2384" id="StrategoLang-RuleNames_3170_3192" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-RuleNames_2362_2384" id="StrategoLang-RuleNames_3223_3245" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3266_3287" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a><span class="keyword">-CF</span> { }

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_4050_4071" id="StrategoLang-Strategy_3319_3340" title="Referenced at line 76">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersect_3948_3964" id="DynRuleIntersect_3341_3357" title="Referenced at line 76">DynRuleIntersect</a></span> = &lt;&lt;<a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3362_3383" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt; <span class="cons_String">/</span>&lt;<a href="#StrategoLang-RuleNames_2362_2384" id="StrategoLang-RuleNames_3387_3409" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a>&gt;\\ &lt;<a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3414_3435" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#StrategoLang-Strategy_4050_4071" id="StrategoLang-Strategy_3448_3469" title="Referenced at line 76">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleUnion_3989_4001" id="DynRuleUnion_3470_3482" title="Referenced at line 76">DynRuleUnion</a></span> = &lt;&lt;<a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3487_3508" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt; \\&lt;<a href="#StrategoLang-RuleNames_2362_2384" id="StrategoLang-RuleNames_3513_3535" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a>&gt;<span class="cons_String">/</span> &lt;<a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3539_3560" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#StrategoLang-Strategy_4050_4071" id="StrategoLang-Strategy_3573_3594" title="Referenced at line 76">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectUnion_4026_4047" id="DynRuleIntersectUnion_3595_3616" title="Referenced at line 76">DynRuleIntersectUnion</a></span> = &lt;&lt;<a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3621_3642" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt; <span class="cons_String">/</span>&lt;<a href="#StrategoLang-RuleNames_2362_2384" id="StrategoLang-RuleNames_3646_3668" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a>&gt;\\&lt;<a href="#StrategoLang-RuleNames_2362_2384" id="StrategoLang-RuleNames_3672_3694" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a>&gt;<span class="cons_String">/</span> &lt;<a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3698_3719" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt;&gt; {<span class="keyword">right</span>}

<span class="keyword">context-free priorities</span>

  <a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3758_3779" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor">BA</span> &gt; {<a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3786_3807" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectFix_2551_2570" id="DynRuleIntersectFix_3808_3827" title="Defined at line 58">DynRuleIntersectFix</a></span>
                              <a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3858_3879" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleUnionFix_2668_2683" id="DynRuleUnionFix_3880_3895" title="Defined at line 62">DynRuleUnionFix</a></span>} &gt; <a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3899_3920" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor">AM</span> &gt; <a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3926_3947" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersect_3341_3357" id="DynRuleIntersect_3948_3964" title="Defined at line 69">DynRuleIntersect</a></span> &gt; <a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_3967_3988" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleUnion_3470_3482" id="DynRuleUnion_3989_4001" title="Defined at line 70">DynRuleUnion</a></span> &gt; <a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_4004_4025" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectUnion_3595_3616" id="DynRuleIntersectUnion_4026_4047" title="Defined at line 71">DynRuleIntersectUnion</a></span> &gt; <a href="#StrategoLang-Strategy_403_424" id="StrategoLang-Strategy_4050_4071" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies-namespaced.sdf3#Seq_2093_2096" id="Seq_4072_4075" title="Defined at ../../core/strategies-namespaced.sdf3 line 65">Seq</a></span>

</code></pre></td></tr></tbody></table></div>