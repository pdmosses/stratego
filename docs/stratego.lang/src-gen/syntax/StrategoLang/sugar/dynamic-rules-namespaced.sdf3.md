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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/sugar/dynamic-rules-namespaced_1_8" title="Multi-file references" data-urls="../main-namespaced.sdf3/#StrategoLang/sugar/dynamic-rules-namespaced_12_3 line 12; ../../deduplicated-namespaced.sdf3/#StrategoLang/sugar/dynamic-rules-namespaced_10_3 line 10">StrategoLang/sugar/dynamic-rules-namespaced</button>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_4_3" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/terms-namespaced.sdf3/#StrategoLang/core/terms-namespaced_1_8" id="StrategoLang/core/terms-namespaced_5_3" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>        
  <a href="../../core/signatures-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_1_8" id="StrategoLang/core/signatures-namespaced_6_3" title="Defined at ../../core/signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>        
  <a href="../../core/strategies-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_1_8" id="StrategoLang/core/strategies-namespaced_7_3" title="Defined at ../../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../strategies-namespaced.sdf3/#StrategoLang/sugar/strategies-namespaced_1_8" id="StrategoLang/sugar/strategies-namespaced_8_3" title="Defined at ../strategies-namespaced.sdf3 line 1">StrategoLang/sugar/strategies-namespaced</a>        
  <a href="../rules-namespaced.sdf3/#StrategoLang/sugar/rules-namespaced_1_8" id="StrategoLang/sugar/rules-namespaced_9_3" title="Defined at ../rules-namespaced.sdf3 line 1">StrategoLang/sugar/rules-namespaced</a>

<span class="keyword">template options</span>

  <span class="keyword">tokenize</span> : ")("

<span class="keyword">sorts</span> <a href="#StrategoLang-ScopeLabels_19_45" id="StrategoLang-ScopeLabels_15_7" title="Referenced at line 19">StrategoLang-ScopeLabels</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_20_4" id="StrategoLang-Strategy_19_3" title="Referenced at line 20, 58, 62, 63, 64, 65, 69, 70, 71, 75, 76">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="DynRuleScope_19_25" title="Not referenced">DynRuleScope</span></span> = &lt;<span class="cons_String">{|</span> &lt;<a href="#StrategoLang-ScopeLabels_15_7" id="StrategoLang-ScopeLabels_19_45" title="Defined at line 15, 22, 23">StrategoLang-ScopeLabels</a>&gt;
<span class="cons_String">:</span> &lt;<a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_20_4" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt;
<span class="cons_String">|}</span>&gt; { }
  <a href="#StrategoLang-ScopeLabels_19_45" id="StrategoLang-ScopeLabels_22_3" title="Referenced at line 19">StrategoLang-ScopeLabels</a> = {<a href="#StrategoLang-DynRuleScopeId_25_54" id="StrategoLang-DynRuleScopeId_22_31" title="Defined at line 25, 41, 42">StrategoLang-DynRuleScopeId</a> <span class="cons_Lit">", "</span>}* { }
  <a href="#StrategoLang-ScopeLabels_19_45" id="StrategoLang-ScopeLabels_23_3" title="Referenced at line 19">StrategoLang-ScopeLabels</a>.<span class="cons_Constructor"><span id="ScopeLabels_23_28" title="Not referenced">ScopeLabels</span></span> = &lt;<span class="cons_String">~</span>&lt;<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_23_45" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-DynRuleDef_29_47" id="StrategoLang-DynRuleDef_25_7" title="Referenced at line 29">StrategoLang-DynRuleDef</a> <a href="#StrategoLang-DynRuleId_31_47" id="StrategoLang-DynRuleId_25_31" title="Referenced at line 31, 32, 33, 34, 35, 36, 37">StrategoLang-DynRuleId</a> <a href="#StrategoLang-DynRuleScopeId_22_31" id="StrategoLang-DynRuleScopeId_25_54" title="Referenced at line 22">StrategoLang-DynRuleScopeId</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_20_4" id="StrategoLang-Strategy_29_3" title="Referenced at line 20, 58, 62, 63, 64, 65, 69, 70, 71, 75, 76">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="GenDynRules_29_25" title="Not referenced">GenDynRules</span></span> = &lt;<span class="cons_String">rules(</span>&lt;<a href="#StrategoLang-DynRuleDef_25_7" id="StrategoLang-DynRuleDef_29_47" title="Defined at line 25, 30, 31, 32, 33, 34, 35, 36, 37">StrategoLang-DynRuleDef</a>*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-DynRuleDef_29_47" id="StrategoLang-DynRuleDef_30_3" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="AddScopeLabel_30_27" title="Not referenced">AddScopeLabel</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_30_45" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt; <span class="cons_String">+</span> &lt;<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_30_66" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_29_47" id="StrategoLang-DynRuleDef_31_3" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="UndefineDynRule_31_27" title="Not referenced">UndefineDynRule</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_25_31" id="StrategoLang-DynRuleId_31_47" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:-</span> &lt;<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_31_75" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_29_47" id="StrategoLang-DynRuleDef_32_3" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="SetDynRule_32_27" title="Not referenced">SetDynRule</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_25_31" id="StrategoLang-DynRuleId_32_42" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:</span> &lt;StrategoLang-Rule&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_29_47" id="StrategoLang-DynRuleDef_33_3" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="AddDynRule_33_27" title="Not referenced">AddDynRule</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_25_31" id="StrategoLang-DynRuleId_33_42" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:+</span> &lt;StrategoLang-Rule&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_29_47" id="StrategoLang-DynRuleDef_34_3" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="SetDynRuleMatch_34_27" title="Not referenced">SetDynRuleMatch</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_25_31" id="StrategoLang-DynRuleId_34_47" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:</span> &lt;<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_34_74" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_29_47" id="StrategoLang-DynRuleDef_35_3" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="DynRuleAssign_35_27" title="Not referenced">DynRuleAssign</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_25_31" id="StrategoLang-DynRuleId_35_45" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:=</span> &lt;<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_35_73" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_29_47" id="StrategoLang-DynRuleDef_36_3" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="DynRuleAssignAdd_36_27" title="Not referenced">DynRuleAssignAdd</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_25_31" id="StrategoLang-DynRuleId_36_48" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:+=</span> &lt;<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_36_77" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleDef_29_47" id="StrategoLang-DynRuleDef_37_3" title="Referenced at line 29">StrategoLang-DynRuleDef</a>.<span class="cons_Constructor"><span id="SetDynRuleDepends_37_27" title="Not referenced">SetDynRuleDepends</span></span> = &lt;&lt;<a href="#StrategoLang-DynRuleId_25_31" id="StrategoLang-DynRuleId_37_49" title="Defined at line 25, 38, 39, 40">StrategoLang-DynRuleId</a>&gt; <span class="cons_String">:</span> &lt;StrategoLang-Rule&gt; <span class="cons_String">depends</span> <span class="cons_String">on</span> &lt;<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_37_107" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleId_31_47" id="StrategoLang-DynRuleId_38_3" title="Referenced at line 31, 32, 33, 34, 35, 36, 37">StrategoLang-DynRuleId</a>.<span class="cons_Constructor"><span id="LabeledDynRuleId_38_26" title="Not referenced">LabeledDynRuleId</span></span> = &lt;&lt;<a href="#StrategoLang-RuleDec_44_7" id="StrategoLang-RuleDec_38_47" title="Defined at line 44, 48, 49, 50">StrategoLang-RuleDec</a>&gt; <span class="cons_String">.</span> &lt;<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_38_72" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleId_31_47" id="StrategoLang-DynRuleId_39_3" title="Referenced at line 31, 32, 33, 34, 35, 36, 37">StrategoLang-DynRuleId</a>.<span class="cons_Constructor"><span id="AddLabelDynRuleId_39_26" title="Not referenced">AddLabelDynRuleId</span></span> = &lt;&lt;<a href="#StrategoLang-RuleDec_44_7" id="StrategoLang-RuleDec_39_48" title="Defined at line 44, 48, 49, 50">StrategoLang-RuleDec</a>&gt; <span class="cons_String">+</span> &lt;<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_39_73" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleId_31_47" id="StrategoLang-DynRuleId_40_3" title="Referenced at line 31, 32, 33, 34, 35, 36, 37">StrategoLang-DynRuleId</a>.<span class="cons_Constructor"><span id="DynRuleId_40_26" title="Not referenced">DynRuleId</span></span> = <a href="#StrategoLang-RuleDec_44_7" id="StrategoLang-RuleDec_40_38" title="Defined at line 44, 48, 49, 50">StrategoLang-RuleDec</a> { }
  <a href="#StrategoLang-DynRuleScopeId_22_31" id="StrategoLang-DynRuleScopeId_41_3" title="Referenced at line 22">StrategoLang-DynRuleScopeId</a>.<span class="cons_Constructor"><span id="LabeledDynRuleScopeId_41_31" title="Not referenced">LabeledDynRuleScopeId</span></span> = &lt;&lt;<a href="../../core/identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_41_57" title="Defined at ../../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt; <span class="cons_String">.</span> &lt;<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_41_77" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-DynRuleScopeId_22_31" id="StrategoLang-DynRuleScopeId_42_3" title="Referenced at line 22">StrategoLang-DynRuleScopeId</a>.<span class="cons_Constructor"><span id="DynRuleScopeId_42_31" title="Not referenced">DynRuleScopeId</span></span> = <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_42_48" title="Defined at ../../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a> { }

<span class="keyword">sorts</span> <a href="#StrategoLang-RuleDec_38_47" id="StrategoLang-RuleDec_44_7" title="Referenced at line 38, 39, 40">StrategoLang-RuleDec</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-RuleDec_38_47" id="StrategoLang-RuleDec_48_3" title="Referenced at line 38, 39, 40">StrategoLang-RuleDec</a>.<span class="cons_Constructor"><span id="RDecNoArgs_48_24" title="Not referenced">RDecNoArgs</span></span> = <a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_48_37" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a> { }
  <a href="#StrategoLang-RuleDec_38_47" id="StrategoLang-RuleDec_49_3" title="Referenced at line 38, 39, 40">StrategoLang-RuleDec</a>.<span class="cons_Constructor"><span id="RDec_49_24" title="Not referenced">RDec</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_49_33" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_49_53" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-RuleDec_38_47" id="StrategoLang-RuleDec_50_3" title="Referenced at line 38, 39, 40">StrategoLang-RuleDec</a>.<span class="cons_Constructor"><span id="RDecT_50_24" title="Not referenced">RDecT</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_50_34" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_50_54" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_50_87" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-RuleNames_58_50" id="StrategoLang-RuleNames_52_7" title="Referenced at line 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-RuleNames</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-RuleNames_58_50" id="StrategoLang-RuleNames_56_3" title="Referenced at line 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-RuleNames</a> = {<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_56_29" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a> <span class="cons_Lit">", "</span>}* { }
  <a href="#StrategoLang-RuleNames_58_50" id="StrategoLang-RuleNames_57_3" title="Referenced at line 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-RuleNames</a>.<span class="cons_Constructor"><span id="RuleNames_57_26" title="Not referenced">RuleNames</span></span> = &lt;<span class="cons_String">~</span>&lt;<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_57_41" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-Strategy_20_4" id="StrategoLang-Strategy_58_3" title="Referenced at line 20, 58, 62, 63, 64, 65, 69, 70, 71, 75, 76">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectFix_75_53" id="DynRuleIntersectFix_58_25" title="Referenced at line 75">DynRuleIntersectFix</a></span> = &lt;<span class="cons_String">/</span>&lt;<a href="#StrategoLang-RuleNames_52_7" id="StrategoLang-RuleNames_58_50" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a>&gt;\\<span class="cons_String">*</span> &lt;<a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_58_78" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt;&gt; { }

<span class="keyword">syntax</span>

  <a href="#StrategoLang-Strategy_20_4" id="StrategoLang-Strategy_62_3" title="Referenced at line 20, 58, 62, 63, 64, 65, 69, 70, 71, 75, 76">StrategoLang-Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><a href="#DynRuleUnionFix_76_53" id="DynRuleUnionFix_62_28" title="Referenced at line 76">DynRuleUnionFix</a></span> = <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-RuleNames_52_7" id="StrategoLang-RuleNames_62_62" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">"/*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_62_104" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a><span class="keyword">-CF</span> { }
  <a href="#StrategoLang-Strategy_20_4" id="StrategoLang-Strategy_63_3" title="Referenced at line 20, 58, 62, 63, 64, 65, 69, 70, 71, 75, 76">StrategoLang-Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleUnionFix1_63_28" title="Not referenced">DynRuleUnionFix1</span></span> = <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-RuleNames_52_7" id="StrategoLang-RuleNames_63_63" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_63_106" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a><span class="keyword">-CF</span> { }
  <a href="#StrategoLang-Strategy_20_4" id="StrategoLang-Strategy_64_3" title="Referenced at line 20, 58, 62, 63, 64, 65, 69, 70, 71, 75, 76">StrategoLang-Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleIntersectUnionFix_64_28" title="Not referenced">DynRuleIntersectUnionFix</span></span> = <span class="cons_Lit">"/"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-RuleNames_52_7" id="StrategoLang-RuleNames_64_70" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-RuleNames_52_7" id="StrategoLang-RuleNames_64_123" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">"/*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_64_165" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a><span class="keyword">-CF</span> { }
  <a href="#StrategoLang-Strategy_20_4" id="StrategoLang-Strategy_65_3" title="Referenced at line 20, 58, 62, 63, 64, 65, 69, 70, 71, 75, 76">StrategoLang-Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleIntersectUnionFix1_65_28" title="Not referenced">DynRuleIntersectUnionFix1</span></span> = <span class="cons_Lit">"/"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-RuleNames_52_7" id="StrategoLang-RuleNames_65_71" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-RuleNames_52_7" id="StrategoLang-RuleNames_65_124" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_65_167" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a><span class="keyword">-CF</span> { }

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_20_4" id="StrategoLang-Strategy_69_3" title="Referenced at line 20, 58, 62, 63, 64, 65, 69, 70, 71, 75, 76">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersect_76_121" id="DynRuleIntersect_69_25" title="Referenced at line 76">DynRuleIntersect</a></span> = &lt;&lt;<a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_69_46" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt; <span class="cons_String">/</span>&lt;<a href="#StrategoLang-RuleNames_52_7" id="StrategoLang-RuleNames_69_71" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a>&gt;\\ &lt;<a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_69_98" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#StrategoLang-Strategy_20_4" id="StrategoLang-Strategy_70_3" title="Referenced at line 20, 58, 62, 63, 64, 65, 69, 70, 71, 75, 76">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleUnion_76_162" id="DynRuleUnion_70_25" title="Referenced at line 76">DynRuleUnion</a></span> = &lt;&lt;<a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_70_42" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt; \\&lt;<a href="#StrategoLang-RuleNames_52_7" id="StrategoLang-RuleNames_70_68" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a>&gt;<span class="cons_String">/</span> &lt;<a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_70_94" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#StrategoLang-Strategy_20_4" id="StrategoLang-Strategy_71_3" title="Referenced at line 20, 58, 62, 63, 64, 65, 69, 70, 71, 75, 76">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectUnion_76_199" id="DynRuleIntersectUnion_71_25" title="Referenced at line 76">DynRuleIntersectUnion</a></span> = &lt;&lt;<a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_71_51" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt; <span class="cons_String">/</span>&lt;<a href="#StrategoLang-RuleNames_52_7" id="StrategoLang-RuleNames_71_76" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a>&gt;\\&lt;<a href="#StrategoLang-RuleNames_52_7" id="StrategoLang-RuleNames_71_102" title="Defined at line 52, 56, 57">StrategoLang-RuleNames</a>&gt;<span class="cons_String">/</span> &lt;<a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_71_128" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>&gt;&gt; {<span class="keyword">right</span>}

<span class="keyword">context-free priorities</span>

  <a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_75_3" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor">BA</span> &gt; {<a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_75_31" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectFix_58_25" id="DynRuleIntersectFix_75_53" title="Defined at line 58">DynRuleIntersectFix</a></span>
                              <a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_76_31" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleUnionFix_62_28" id="DynRuleUnionFix_76_53" title="Defined at line 62">DynRuleUnionFix</a></span>} &gt; <a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_76_72" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor">AM</span> &gt; <a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_76_99" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersect_69_25" id="DynRuleIntersect_76_121" title="Defined at line 69">DynRuleIntersect</a></span> &gt; <a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_76_140" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleUnion_70_25" id="DynRuleUnion_76_162" title="Defined at line 70">DynRuleUnion</a></span> &gt; <a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_76_177" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectUnion_71_25" id="DynRuleIntersectUnion_76_199" title="Defined at line 71">DynRuleIntersectUnion</a></span> &gt; <a href="#StrategoLang-Strategy_19_3" id="StrategoLang-Strategy_76_223" title="Defined at line 19, 29, 58, 62, 63, 64, 65, 69, 70, 71">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies-namespaced.sdf3/#Seq_65_25" id="Seq_76_245" title="Defined at ../../core/strategies-namespaced.sdf3 line 65">Seq</a></span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
