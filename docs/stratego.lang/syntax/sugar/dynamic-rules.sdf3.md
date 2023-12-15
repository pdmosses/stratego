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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="sugar/dynamic-rules_1_8" title="Multi-file references" data-urls="../main.sdf3/#sugar/dynamic-rules_13_3 line 13; ../../deduplicated.sdf3/#sugar/dynamic-rules_11_3 line 11">sugar/dynamic-rules</button>

<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_4_3" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/terms.sdf3/#core/terms_1_8" id="core/terms_5_3" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>
  <a href="../../core/signatures.sdf3/#core/signatures_1_8" id="core/signatures_6_3" title="Defined at ../../core/signatures.sdf3 line 1">core/signatures</a>
  <a href="../../core/strategies.sdf3/#core/strategies_1_8" id="core/strategies_7_3" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../strategies.sdf3/#sugar/strategies_1_8" id="sugar/strategies_8_3" title="Defined at ../strategies.sdf3 line 1">sugar/strategies</a>
  <a href="../rules.sdf3/#sugar/rules_1_8" id="sugar/rules_9_3" title="Defined at ../rules.sdf3 line 1">sugar/rules</a>

<span class="keyword">template options</span>
  <span class="keyword">tokenize</span>: ")("

<span class="keyword">context-free sorts</span> <a href="#ScopeLabels_17_6" id="ScopeLabels_14_20" title="Referenced at line 17">ScopeLabels</a>
<span class="keyword">context-free syntax</span>
  <a href="#Strategy_18_4" id="Strategy_16_3" title="Referenced at line 18, 67, 72, 77, 82, 87, 92, 94, 96, 99, 100, 101, 102, 103, 104, 105">Strategy</a>.<span class="cons_Constructor"><span id="DynRuleScope_16_12" title="Not referenced">DynRuleScope</span></span> =
&lt;<span class="cons_String">{|</span> &lt;<a href="#ScopeLabels_14_20" id="ScopeLabels_17_6" title="Defined at line 14, 21, 23">ScopeLabels</a>&gt;
<span class="cons_String">:</span> &lt;<a href="#Strategy_16_3" id="Strategy_18_4" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt;
<span class="cons_String">|}</span>&gt;

  <a href="#ScopeLabels_17_6" id="ScopeLabels_21_3" title="Referenced at line 17">ScopeLabels</a> = {<a href="#DynRuleScopeId_25_41" id="DynRuleScopeId_21_18" title="Defined at line 25, 51, 53">DynRuleScopeId</a> <span class="cons_Lit">", "</span>}*

  <a href="#ScopeLabels_17_6" id="ScopeLabels_23_3" title="Referenced at line 17">ScopeLabels</a>.<span class="cons_Constructor"><span id="ScopeLabels_23_15" title="Not referenced">ScopeLabels</span></span> = &lt;<span class="cons_String">~</span>&lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_23_32" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;

<span class="keyword">context-free sorts</span> <a href="#DynRuleDef_29_13" id="DynRuleDef_25_20" title="Referenced at line 29">DynRuleDef</a> <a href="#DynRuleId_33_7" id="DynRuleId_25_31" title="Referenced at line 33, 35, 37, 39, 41, 43, 45">DynRuleId</a> <a href="#DynRuleScopeId_21_18" id="DynRuleScopeId_25_41" title="Referenced at line 21">DynRuleScopeId</a>
<span class="keyword">context-free syntax</span>

  <a href="#Strategy_18_4" id="Strategy_28_3" title="Referenced at line 18, 67, 72, 77, 82, 87, 92, 94, 96, 99, 100, 101, 102, 103, 104, 105">Strategy</a>.<span class="cons_Constructor"><span id="GenDynRules_28_12" title="Not referenced">GenDynRules</span></span> =
    &lt;<span class="cons_String">rules(</span>&lt;<a href="#DynRuleDef_25_20" id="DynRuleDef_29_13" title="Defined at line 25, 30, 32, 34, 36, 38, 40, 42, 44">DynRuleDef</a>*&gt;<span class="cons_String">)</span>&gt;
  <a href="#DynRuleDef_29_13" id="DynRuleDef_30_3" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="AddScopeLabel_30_14" title="Not referenced">AddScopeLabel</span></span> =
    &lt;&lt;<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_31_7" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt; <span class="cons_String">+</span> &lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_31_15" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleDef_29_13" id="DynRuleDef_32_3" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="UndefineDynRule_32_14" title="Not referenced">UndefineDynRule</span></span> =
    &lt;&lt;<a href="#DynRuleId_25_31" id="DynRuleId_33_7" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:-</span> &lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_33_22" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleDef_29_13" id="DynRuleDef_34_3" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="SetDynRule_34_14" title="Not referenced">SetDynRule</span></span> =
    &lt;&lt;<a href="#DynRuleId_25_31" id="DynRuleId_35_7" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:</span> &lt;<a href="../rules.sdf3/#Rule_39_20" id="Rule_35_21" title="Defined at ../rules.sdf3 line 39, 42">Rule</a>&gt;&gt;
  <a href="#DynRuleDef_29_13" id="DynRuleDef_36_3" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="AddDynRule_36_14" title="Not referenced">AddDynRule</span></span> =
    &lt;&lt;<a href="#DynRuleId_25_31" id="DynRuleId_37_7" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:+</span> &lt;<a href="../rules.sdf3/#Rule_39_20" id="Rule_37_22" title="Defined at ../rules.sdf3 line 39, 42">Rule</a>&gt;&gt;
  <a href="#DynRuleDef_29_13" id="DynRuleDef_38_3" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="SetDynRuleMatch_38_14" title="Not referenced">SetDynRuleMatch</span></span> =
    &lt;&lt;<a href="#DynRuleId_25_31" id="DynRuleId_39_7" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:</span> &lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_39_21" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleDef_29_13" id="DynRuleDef_40_3" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="DynRuleAssign_40_14" title="Not referenced">DynRuleAssign</span></span> =
    &lt;&lt;<a href="#DynRuleId_25_31" id="DynRuleId_41_7" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:=</span> &lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_41_22" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleDef_29_13" id="DynRuleDef_42_3" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="DynRuleAssignAdd_42_14" title="Not referenced">DynRuleAssignAdd</span></span> =
    &lt;&lt;<a href="#DynRuleId_25_31" id="DynRuleId_43_7" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:+=</span> &lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_43_23" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleDef_29_13" id="DynRuleDef_44_3" title="Referenced at line 29">DynRuleDef</a>.<span class="cons_Constructor"><span id="SetDynRuleDepends_44_14" title="Not referenced">SetDynRuleDepends</span></span> =
    &lt;&lt;<a href="#DynRuleId_25_31" id="DynRuleId_45_7" title="Defined at line 25, 46, 48, 50">DynRuleId</a>&gt; <span class="cons_String">:</span> &lt;<a href="../rules.sdf3/#Rule_39_20" id="Rule_45_21" title="Defined at ../rules.sdf3 line 39, 42">Rule</a>&gt; <span class="cons_String">depends</span> <span class="cons_String">on</span> &lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_45_39" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleId_33_7" id="DynRuleId_46_3" title="Referenced at line 33, 35, 37, 39, 41, 43, 45">DynRuleId</a>.<span class="cons_Constructor"><span id="LabeledDynRuleId_46_13" title="Not referenced">LabeledDynRuleId</span></span> =
    &lt;&lt;<a href="#RuleDec_55_20" id="RuleDec_47_7" title="Defined at line 55, 58, 59, 60">RuleDec</a>&gt; <span class="cons_String">.</span> &lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_47_19" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleId_33_7" id="DynRuleId_48_3" title="Referenced at line 33, 35, 37, 39, 41, 43, 45">DynRuleId</a>.<span class="cons_Constructor"><span id="AddLabelDynRuleId_48_13" title="Not referenced">AddLabelDynRuleId</span></span> =
    &lt;&lt;<a href="#RuleDec_55_20" id="RuleDec_49_7" title="Defined at line 55, 58, 59, 60">RuleDec</a>&gt; <span class="cons_String">+</span> &lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_49_19" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleId_33_7" id="DynRuleId_50_3" title="Referenced at line 33, 35, 37, 39, 41, 43, 45">DynRuleId</a>.<span class="cons_Constructor"><span id="DynRuleId_50_13" title="Not referenced">DynRuleId</span></span> = <a href="#RuleDec_55_20" id="RuleDec_50_25" title="Defined at line 55, 58, 59, 60">RuleDec</a>
  <a href="#DynRuleScopeId_21_18" id="DynRuleScopeId_51_3" title="Referenced at line 21">DynRuleScopeId</a>.<span class="cons_Constructor"><span id="LabeledDynRuleScopeId_51_18" title="Not referenced">LabeledDynRuleScopeId</span></span> =
    &lt;&lt;<a href="../../core/identifiers.sdf3/#Id_16_15" id="Id_52_7" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt; <span class="cons_String">.</span> &lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_52_14" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#DynRuleScopeId_21_18" id="DynRuleScopeId_53_3" title="Referenced at line 21">DynRuleScopeId</a>.<span class="cons_Constructor"><span id="DynRuleScopeId_53_18" title="Not referenced">DynRuleScopeId</span></span> = <a href="../../core/identifiers.sdf3/#Id_16_15" id="Id_53_35" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>

<span class="keyword">context-free sorts</span> <a href="#RuleDec_47_7" id="RuleDec_55_20" title="Referenced at line 47, 49, 50">RuleDec</a>
<span class="keyword">context-free syntax</span>

  <a href="#RuleDec_47_7" id="RuleDec_58_3" title="Referenced at line 47, 49, 50">RuleDec</a>.<span class="cons_Constructor"><span id="RDecNoArgs_58_11" title="Not referenced">RDecNoArgs</span></span> = <a href="../../core/strategies.sdf3/#SId_34_15" id="SId_58_24" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>
  <a href="#RuleDec_47_7" id="RuleDec_59_3" title="Referenced at line 47, 49, 50">RuleDec</a>.<span class="cons_Constructor"><span id="RDec_59_11" title="Not referenced">RDec</span></span> = &lt;&lt;<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_59_20" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies.sdf3/#Typedid_48_20" id="Typedid_59_27" title="Defined at ../../core/strategies.sdf3 line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">)</span>&gt;
  <a href="#RuleDec_47_7" id="RuleDec_60_3" title="Referenced at line 47, 49, 50">RuleDec</a>.<span class="cons_Constructor"><span id="RDecT_60_11" title="Not referenced">RDecT</span></span> = &lt;&lt;<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_60_21" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies.sdf3/#Typedid_48_20" id="Typedid_60_28" title="Defined at ../../core/strategies.sdf3 line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="../../core/strategies.sdf3/#Typedid_48_20" id="Typedid_60_48" title="Defined at ../../core/strategies.sdf3 line 48, 50">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">context-free sorts</span> <button class="modal-open" id="RuleNames_62_20" title="Multi-file references" data-urls="#RuleNames_67_37 line 67, 72, 77, 81, 82, 86, 87, 92, 94, 96; ../../deduplicated.sdf3/#RuleNames_46_19 line 46, 50, 51">RuleNames</button>
<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="RuleNames_65_3" title="Multi-file references" data-urls="#RuleNames_67_37 line 67, 72, 77, 81, 82, 86, 87, 92, 94, 96; ../../deduplicated.sdf3/#RuleNames_46_19 line 46, 50, 51">RuleNames</button> = {<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_65_16" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a> <span class="cons_Lit">", "</span>}*
  <button class="modal-open" id="RuleNames_66_3" title="Multi-file references" data-urls="#RuleNames_67_37 line 67, 72, 77, 81, 82, 86, 87, 92, 94, 96; ../../deduplicated.sdf3/#RuleNames_46_19 line 46, 50, 51">RuleNames</button>.<span class="cons_Constructor"><span id="RuleNames_66_13" title="Not referenced">RuleNames</span></span> = &lt;<span class="cons_String">~</span>&lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_66_28" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;
  <a href="#Strategy_18_4" id="Strategy_67_3" title="Referenced at line 18, 67, 72, 77, 82, 87, 92, 94, 96, 99, 100, 101, 102, 103, 104, 105">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectFix_100_17" id="DynRuleIntersectFix_67_12" title="Referenced at line 100">DynRuleIntersectFix</a></span> = &lt;<span class="cons_String">/</span>&lt;<a href="#RuleNames_62_20" id="RuleNames_67_37" title="Defined at line 62, 65, 66">RuleNames</a>&gt;\\<span class="cons_String">*</span> &lt;<a href="#Strategy_16_3" id="Strategy_67_52" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt;&gt;

<span class="keyword">syntax</span>
  <span class="layout">// no space after RuleNames</span>
  <a href="#Strategy_18_4" id="Strategy_71_3" title="Referenced at line 18, 67, 72, 77, 82, 87, 92, 94, 96, 99, 100, 101, 102, 103, 104, 105">Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><a href="#DynRuleUnionFix_100_46" id="DynRuleUnionFix_71_15" title="Referenced at line 100">DynRuleUnionFix</a></span> =
  <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#RuleNames_62_20" id="RuleNames_72_19" title="Defined at line 62, 65, 66">RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">"/*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Strategy_16_3" id="Strategy_72_48" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a><span class="keyword">-CF</span>


  <span class="layout">// 1 space after RuleNames</span>
  <a href="#Strategy_18_4" id="Strategy_76_3" title="Referenced at line 18, 67, 72, 77, 82, 87, 92, 94, 96, 99, 100, 101, 102, 103, 104, 105">Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleUnionFix1_76_15" title="Not referenced">DynRuleUnionFix1</span></span> =
  <span class="cons_Lit">"\\"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#RuleNames_62_20" id="RuleNames_77_19" title="Defined at line 62, 65, 66">RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Strategy_16_3" id="Strategy_77_49" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a><span class="keyword">-CF</span>

  <span class="layout">// no space after RuleNames</span>
  <a href="#Strategy_18_4" id="Strategy_80_3" title="Referenced at line 18, 67, 72, 77, 82, 87, 92, 94, 96, 99, 100, 101, 102, 103, 104, 105">Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleIntersectUnionFix_80_15" title="Not referenced">DynRuleIntersectUnionFix</span></span> =
  <span class="cons_Lit">"/"</span>  <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#RuleNames_62_20" id="RuleNames_81_19" title="Defined at line 62, 65, 66">RuleNames</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"\\"</span>
      <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#RuleNames_62_20" id="RuleNames_82_18" title="Defined at line 62, 65, 66">RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">"/*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Strategy_16_3" id="Strategy_82_47" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a><span class="keyword">-CF</span>

  <span class="layout">// 1 space after RuleNames</span>
  <a href="#Strategy_18_4" id="Strategy_85_3" title="Referenced at line 18, 67, 72, 77, 82, 87, 92, 94, 96, 99, 100, 101, 102, 103, 104, 105">Strategy</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="DynRuleIntersectUnionFix1_85_15" title="Not referenced">DynRuleIntersectUnionFix1</span></span> =
  <span class="cons_Lit">"/"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#RuleNames_62_20" id="RuleNames_86_18" title="Defined at line 62, 65, 66">RuleNames</a><span class="keyword">-CF LAYOUT</span>?<span class="keyword">-CF</span> <span class="cons_Lit">"\\"</span>
      <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#RuleNames_62_20" id="RuleNames_87_18" title="Defined at line 62, 65, 66">RuleNames</a><span class="keyword">-CF</span> <span class="cons_Lit">" /*"</span> <span class="keyword">LAYOUT</span>?<span class="keyword">-CF</span> <a href="#Strategy_16_3" id="Strategy_87_48" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a><span class="keyword">-CF</span>

<span class="keyword">context-free syntax</span>

  <a href="#Strategy_18_4" id="Strategy_91_3" title="Referenced at line 18, 67, 72, 77, 82, 87, 92, 94, 96, 99, 100, 101, 102, 103, 104, 105">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersect_102_15" id="DynRuleIntersect_91_12" title="Referenced at line 102">DynRuleIntersect</a></span> =
    &lt;&lt;<a href="#Strategy_16_3" id="Strategy_92_7" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt; <span class="cons_String">/</span>&lt;<a href="#RuleNames_62_20" id="RuleNames_92_19" title="Defined at line 62, 65, 66">RuleNames</a>&gt;\\ &lt;<a href="#Strategy_16_3" id="Strategy_92_33" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#Strategy_18_4" id="Strategy_93_3" title="Referenced at line 18, 67, 72, 77, 82, 87, 92, 94, 96, 99, 100, 101, 102, 103, 104, 105">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleUnion_103_15" id="DynRuleUnion_93_12" title="Referenced at line 103">DynRuleUnion</a></span> =
    &lt;&lt;<a href="#Strategy_16_3" id="Strategy_94_7" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt; \\&lt;<a href="#RuleNames_62_20" id="RuleNames_94_20" title="Defined at line 62, 65, 66">RuleNames</a>&gt;<span class="cons_String">/</span> &lt;<a href="#Strategy_16_3" id="Strategy_94_33" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#Strategy_18_4" id="Strategy_95_3" title="Referenced at line 18, 67, 72, 77, 82, 87, 92, 94, 96, 99, 100, 101, 102, 103, 104, 105">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectUnion_104_15" id="DynRuleIntersectUnion_95_12" title="Referenced at line 104">DynRuleIntersectUnion</a></span> =
    &lt;&lt;<a href="#Strategy_16_3" id="Strategy_96_7" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt; <span class="cons_String">/</span>&lt;<a href="#RuleNames_62_20" id="RuleNames_96_19" title="Defined at line 62, 65, 66">RuleNames</a>&gt;\\&lt;<a href="#RuleNames_62_20" id="RuleNames_96_32" title="Defined at line 62, 65, 66">RuleNames</a>&gt;<span class="cons_String">/</span> &lt;<a href="#Strategy_16_3" id="Strategy_96_45" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>&gt;&gt; {<span class="keyword">right</span>}

<span class="keyword">context-free priorities</span>
     <a href="#Strategy_16_3" id="Strategy_99_6" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="../strategies.sdf3/#BA_42_12" id="BA_99_15" title="Defined at ../strategies.sdf3 line 42">BA</a></span>
   &gt; { <a href="#Strategy_16_3" id="Strategy_100_8" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectFix_67_12" id="DynRuleIntersectFix_100_17" title="Defined at line 67">DynRuleIntersectFix</a></span> <a href="#Strategy_16_3" id="Strategy_100_37" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleUnionFix_71_15" id="DynRuleUnionFix_100_46" title="Defined at line 71">DynRuleUnionFix</a></span> }
   &gt; <a href="#Strategy_16_3" id="Strategy_101_6" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="../strategies.sdf3/#AM_67_12" id="AM_101_15" title="Defined at ../strategies.sdf3 line 67">AM</a></span>
   &gt; <a href="#Strategy_16_3" id="Strategy_102_6" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersect_91_12" id="DynRuleIntersect_102_15" title="Defined at line 91">DynRuleIntersect</a></span>
   &gt; <a href="#Strategy_16_3" id="Strategy_103_6" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleUnion_93_12" id="DynRuleUnion_103_15" title="Defined at line 93">DynRuleUnion</a></span>
   &gt; <a href="#Strategy_16_3" id="Strategy_104_6" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="#DynRuleIntersectUnion_95_12" id="DynRuleIntersectUnion_104_15" title="Defined at line 95">DynRuleIntersectUnion</a></span>
   &gt; <a href="#Strategy_16_3" id="Strategy_105_6" title="Defined at line 16, 28, 67, 71, 76, 80, 85, 91, 93, 95">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3/#Seq_62_12" id="Seq_105_15" title="Defined at ../../core/strategies.sdf3 line 62">Seq</a></span>


</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
