---
title: rules.sdf3
hide:
  - toc
---

# `rules.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/sugar/rules.sdf3]

[pdmosses/stratego/stratego.lang/syntax/sugar/rules.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/sugar/rules.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="sugar/rules_1_8" title="Multi-file references" data-urls="../dynamic-rules.sdf3/#sugar/rules_9_3 line 9; ../main.sdf3/#sugar/rules_12_3 line 12; ../modules.sdf3/#sugar/rules_6_3 line 6; ../strategies.sdf3/#sugar/rules_8_3 line 8; ../../deduplicated.sdf3/#sugar/rules_9_3 line 9">sugar/rules</button>

  <span class="keyword">imports</span>
    <a href="../../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_4_5" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
    <a href="../../core/signatures.sdf3/#core/signatures_1_8" id="core/signatures_5_5" title="Defined at ../../core/signatures.sdf3 line 1">core/signatures</a>
    <a href="../../core/terms.sdf3/#core/terms_1_8" id="core/terms_6_5" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>
    <a href="../../core/strategies.sdf3/#core/strategies_1_8" id="core/strategies_7_5" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
    <a href="../terms.sdf3/#sugar/terms_1_8" id="sugar/terms_8_5" title="Defined at ../terms.sdf3 line 1">sugar/terms</a>
    <a href="../strategies.sdf3/#sugar/strategies_1_8" id="sugar/strategies_9_5" title="Defined at ../strategies.sdf3 line 1">sugar/strategies</a>

<span class="keyword">template options</span>
  <span class="keyword">tokenize</span>: ")(|"

<span class="keyword">context-free sorts</span> <button class="modal-open" id="RuleDef_14_20" title="Multi-file references" data-urls="#RuleDef_21_15 line 21; ../modules.sdf3/#RuleDef_17_11 line 17; ../../deduplicated.sdf3/#RuleDef_41_15 line 41">RuleDef</button> <a href="#RDefT_27_13" id="RDefT_14_28" title="Referenced at line 27, 37">RDefT</a> <a href="#RDefP_33_13" id="RDefP_14_34" title="Referenced at line 33">RDefP</a>
<span class="keyword">context-free syntax</span>
  <button class="modal-open" id="RuleDef_16_3" title="Multi-file references" data-urls="#RuleDef_21_15 line 21; ../modules.sdf3/#RuleDef_17_11 line 17; ../../deduplicated.sdf3/#RuleDef_41_15 line 41">RuleDef</button>.<span class="cons_Constructor"><span id="RDefNoArgs_16_11" title="Not referenced">RDefNoArgs</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_17_3" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">:</span>
  &lt;<a href="#Rule_39_20" id="Rule_18_4" title="Defined at line 39, 42">Rule</a>&gt;&gt;

  <span id="Def_20_3" title="Not referenced">Def</span>.<span class="cons_Constructor"><span id="AnnoRuleDef_20_7" title="Not referenced">AnnoRuleDef</span></span> =
    &lt;&lt;<a href="../../core/strategies.sdf3/#Anno_42_20" id="Anno_21_7" title="Defined at ../../core/strategies.sdf3 line 42, 44, 45, 46">Anno</a>+&gt; &lt;<a href="#RuleDef_14_20" id="RuleDef_21_15" title="Defined at line 14, 16, 23, 27, 33">RuleDef</a>&gt;&gt;

  <button class="modal-open" id="RuleDef_23_3" title="Multi-file references" data-urls="#RuleDef_21_15 line 21; ../modules.sdf3/#RuleDef_17_11 line 17; ../../deduplicated.sdf3/#RuleDef_41_15 line 41">RuleDef</button>.<span class="cons_Constructor"><span id="RDef_23_11" title="Not referenced">RDef</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_24_3" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../strategies.sdf3/#Typedid_33_3" id="Typedid_24_10" title="Defined at ../strategies.sdf3 line 33">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">):</span>
  &lt;<a href="#Rule_39_20" id="Rule_25_4" title="Defined at line 39, 42">Rule</a>&gt;&gt;

  <button class="modal-open" id="RuleDef_27_3" title="Multi-file references" data-urls="#RuleDef_21_15 line 21; ../modules.sdf3/#RuleDef_17_11 line 17; ../../deduplicated.sdf3/#RuleDef_41_15 line 41">RuleDef</button> = <a href="#RDefT_14_28" id="RDefT_27_13" title="Defined at line 14, 28">RDefT</a>
  <a href="#RDefT_27_13" id="RDefT_28_3" title="Referenced at line 27, 37">RDefT</a>.<span class="cons_Constructor"><span id="RDefT_28_9" title="Not referenced">RDefT</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_29_3" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../strategies.sdf3/#Typedid_33_3" id="Typedid_29_10" title="Defined at ../strategies.sdf3 line 33">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="../strategies.sdf3/#Typedid_33_3" id="Typedid_29_30" title="Defined at ../strategies.sdf3 line 33">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">):</span>
  &lt;<a href="#Rule_39_20" id="Rule_30_4" title="Defined at line 39, 42">Rule</a>&gt;&gt;

  <span class="layout">// Rule definition with pattern matched term parameters</span>
  <button class="modal-open" id="RuleDef_33_3" title="Multi-file references" data-urls="#RuleDef_21_15 line 21; ../modules.sdf3/#RuleDef_17_11 line 17; ../../deduplicated.sdf3/#RuleDef_41_15 line 41">RuleDef</button> = <a href="#RDefP_14_34" id="RDefP_33_13" title="Defined at line 14, 34, 37">RDefP</a>
  <a href="#RDefP_33_13" id="RDefP_34_3" title="Referenced at line 33">RDefP</a>.<span class="cons_Constructor"><span id="RDefP_34_9" title="Not referenced">RDefP</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_35_3" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../strategies.sdf3/#Typedid_33_3" id="Typedid_35_10" title="Defined at ../strategies.sdf3 line 33">Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="../../core/terms.sdf3/#Term_13_20" id="Term_35_30" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">):</span>
  &lt;<a href="#Rule_39_20" id="Rule_36_4" title="Defined at line 39, 42">Rule</a>&gt;&gt;
  <a href="#RDefP_33_13" id="RDefP_37_3" title="Referenced at line 33">RDefP</a> = <a href="#RDefT_14_28" id="RDefT_37_11" title="Defined at line 14, 28">RDefT</a> {<span class="keyword">reject</span>}

<span class="keyword">context-free sorts</span> <button class="modal-open" id="Rule_39_20" title="Multi-file references" data-urls="#Rule_18_4 line 18, 25, 30, 36; ../dynamic-rules.sdf3/#Rule_35_21 line 35, 37, 45; ../strategies.sdf3/#Rule_77_29 line 77, 78">Rule</button> <a href="#RuleCond_43_5" id="RuleCond_39_25" title="Referenced at line 43">RuleCond</a>
<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Rule_42_3" title="Multi-file references" data-urls="#Rule_18_4 line 18, 25, 30, 36; ../dynamic-rules.sdf3/#Rule_35_21 line 35, 37, 45; ../strategies.sdf3/#Rule_77_29 line 77, 78">Rule</button>.<span class="cons_Constructor"><span id="Rule_42_8" title="Not referenced">Rule</span></span> = [[<a href="../../core/terms.sdf3/#Term_13_20" id="Term_42_17" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>] <span class="cons_String">-&gt;</span> [<a href="../../core/terms.sdf3/#Term_13_20" id="Term_42_27" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>]
  [{<a href="#RuleCond_39_25" id="RuleCond_43_5" title="Defined at line 39, 45, 48">RuleCond</a> <span class="cons_Lit">"\n"</span>}*]]

  <a href="#RuleCond_43_5" id="RuleCond_45_3" title="Referenced at line 43">RuleCond</a>.<span class="cons_Constructor"><span id="WhereClause_45_12" title="Not referenced">WhereClause</span></span> =
&lt;<span class="cons_String">where</span>
  &lt;<a href="../strategies.sdf3/#Strategy_38_3" id="Strategy_47_4" title="Defined at ../strategies.sdf3 line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;&gt;
  <a href="#RuleCond_43_5" id="RuleCond_48_3" title="Referenced at line 43">RuleCond</a>.<span class="cons_Constructor"><span id="WithClause_48_12" title="Not referenced">WithClause</span></span> =
&lt;<span class="cons_String">with</span>
  &lt;<a href="../strategies.sdf3/#Strategy_38_3" id="Strategy_50_4" title="Defined at ../strategies.sdf3 line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;&gt;



</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
