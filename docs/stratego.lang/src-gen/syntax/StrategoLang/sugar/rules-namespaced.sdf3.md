---
title: rules-namespaced.sdf3
hide:
  - toc
---

# `rules-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/rules-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/rules-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/sugar/rules-namespaced_1_8" title="Multi-file references" data-urls="../dynamic-rules-namespaced.sdf3/#StrategoLang/sugar/rules-namespaced_9_3 line 9; ../main-namespaced.sdf3/#StrategoLang/sugar/rules-namespaced_11_3 line 11; ../modules-namespaced.sdf3/#StrategoLang/sugar/rules-namespaced_7_3 line 7; ../strategies-namespaced.sdf3/#StrategoLang/sugar/rules-namespaced_9_3 line 9; ../../deduplicated-namespaced.sdf3/#StrategoLang/sugar/rules-namespaced_8_3 line 8">StrategoLang/sugar/rules-namespaced</button>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_4_3" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/signatures-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_1_8" id="StrategoLang/core/signatures-namespaced_5_3" title="Defined at ../../core/signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>        
  <a href="../../core/terms-namespaced.sdf3/#StrategoLang/core/terms-namespaced_1_8" id="StrategoLang/core/terms-namespaced_6_3" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>        
  <a href="../../core/strategies-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_1_8" id="StrategoLang/core/strategies-namespaced_7_3" title="Defined at ../../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../terms-namespaced.sdf3/#StrategoLang/sugar/terms-namespaced_1_8" id="StrategoLang/sugar/terms-namespaced_8_3" title="Defined at ../terms-namespaced.sdf3 line 1">StrategoLang/sugar/terms-namespaced</a>        
  <a href="../strategies-namespaced.sdf3/#StrategoLang/sugar/strategies-namespaced_1_8" id="StrategoLang/sugar/strategies-namespaced_9_3" title="Defined at ../strategies-namespaced.sdf3 line 1">StrategoLang/sugar/strategies-namespaced</a>

<span class="keyword">template options</span>

  <span class="keyword">tokenize</span> : ")(|"

<span class="keyword">sorts</span> <a href="#StrategoLang-RuleDef_21_57" id="StrategoLang-RuleDef_15_7" title="Referenced at line 21">StrategoLang-RuleDef</a> <a href="#StrategoLang-RDefT_24_26" id="StrategoLang-RDefT_15_28" title="Referenced at line 24, 30">StrategoLang-RDefT</a> <a href="#StrategoLang-RDefP_27_26" id="StrategoLang-RDefP_15_47" title="Referenced at line 27">StrategoLang-RDefP</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-RuleDef_21_57" id="StrategoLang-RuleDef_19_3" title="Referenced at line 21">StrategoLang-RuleDef</a>.<span class="cons_Constructor"><span id="RDefNoArgs_19_24" title="Not referenced">RDefNoArgs</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_19_39" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">:</span>
  &lt;<a href="#StrategoLang-Rule_32_7" id="StrategoLang-Rule_20_4" title="Defined at line 32, 36">StrategoLang-Rule</a>&gt;&gt; { }
  <span id="StrategoLang-Def_21_3" title="Not referenced">StrategoLang-Def</span>.<span class="cons_Constructor"><span id="AnnoRuleDef_21_20" title="Not referenced">AnnoRuleDef</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-Anno_40_7" id="StrategoLang-Anno_21_36" title="Defined at ../../core/strategies-namespaced.sdf3 line 40, 44, 45, 46">StrategoLang-Anno</a>+&gt; &lt;<a href="#StrategoLang-RuleDef_15_7" id="StrategoLang-RuleDef_21_57" title="Defined at line 15, 19, 22, 24, 27">StrategoLang-RuleDef</a>&gt;&gt; { }
  <a href="#StrategoLang-RuleDef_21_57" id="StrategoLang-RuleDef_22_3" title="Referenced at line 21">StrategoLang-RuleDef</a>.<span class="cons_Constructor"><span id="RDef_22_24" title="Not referenced">RDef</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_22_33" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_22_53" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">):</span>
  &lt;<a href="#StrategoLang-Rule_32_7" id="StrategoLang-Rule_23_4" title="Defined at line 32, 36">StrategoLang-Rule</a>&gt;&gt; { }
  <a href="#StrategoLang-RuleDef_21_57" id="StrategoLang-RuleDef_24_3" title="Referenced at line 21">StrategoLang-RuleDef</a> = <a href="#StrategoLang-RDefT_15_28" id="StrategoLang-RDefT_24_26" title="Defined at line 15, 25">StrategoLang-RDefT</a> { }
  <a href="#StrategoLang-RDefT_24_26" id="StrategoLang-RDefT_25_3" title="Referenced at line 24, 30">StrategoLang-RDefT</a>.<span class="cons_Constructor"><span id="RDefT_25_22" title="Not referenced">RDefT</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_25_32" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_25_52" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_25_85" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">):</span>
  &lt;<a href="#StrategoLang-Rule_32_7" id="StrategoLang-Rule_26_4" title="Defined at line 32, 36">StrategoLang-Rule</a>&gt;&gt; { }
  <a href="#StrategoLang-RuleDef_21_57" id="StrategoLang-RuleDef_27_3" title="Referenced at line 21">StrategoLang-RuleDef</a> = <a href="#StrategoLang-RDefP_15_47" id="StrategoLang-RDefP_27_26" title="Defined at line 15, 28, 30">StrategoLang-RDefP</a> { }
  <a href="#StrategoLang-RDefP_27_26" id="StrategoLang-RDefP_28_3" title="Referenced at line 27">StrategoLang-RDefP</a>.<span class="cons_Constructor"><span id="RDefP_28_22" title="Not referenced">RDefP</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_28_32" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-Typedid_48_7" id="StrategoLang-Typedid_28_52" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_28_85" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">):</span>
  &lt;<a href="#StrategoLang-Rule_32_7" id="StrategoLang-Rule_29_4" title="Defined at line 32, 36">StrategoLang-Rule</a>&gt;&gt; { }
  <a href="#StrategoLang-RDefP_27_26" id="StrategoLang-RDefP_30_3" title="Referenced at line 27">StrategoLang-RDefP</a> = <a href="#StrategoLang-RDefT_15_28" id="StrategoLang-RDefT_30_24" title="Defined at line 15, 25">StrategoLang-RDefT</a> {<span class="keyword">reject</span>}

<span class="keyword">sorts</span> <button class="modal-open" id="StrategoLang-Rule_32_7" title="Multi-file references" data-urls="#StrategoLang-Rule_20_4 line 20, 23, 26, 29; ../strategies-namespaced.sdf3/#StrategoLang-Rule_73_37 line 73, 74">StrategoLang-Rule</button> <a href="#StrategoLang-RuleCond_37_5" id="StrategoLang-RuleCond_32_25" title="Referenced at line 37">StrategoLang-RuleCond</a>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="StrategoLang-Rule_36_3" title="Multi-file references" data-urls="#StrategoLang-Rule_20_4 line 20, 23, 26, 29; ../strategies-namespaced.sdf3/#StrategoLang-Rule_73_37 line 73, 74">StrategoLang-Rule</button>.<span class="cons_Constructor"><span id="Rule_36_21" title="Not referenced">Rule</span></span> = [[<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_36_30" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>] <span class="cons_String">-&gt;</span> [<a href="../../core/terms-namespaced.sdf3/#StrategoLang-Term_15_7" id="StrategoLang-Term_36_53" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>]
  [{<a href="#StrategoLang-RuleCond_32_25" id="StrategoLang-RuleCond_37_5" title="Defined at line 32, 38, 40">StrategoLang-RuleCond</a> <span class="cons_Lit">"\n"</span>}*]] { }
  <a href="#StrategoLang-RuleCond_37_5" id="StrategoLang-RuleCond_38_3" title="Referenced at line 37">StrategoLang-RuleCond</a>.<span class="cons_Constructor"><span id="WhereClause_38_25" title="Not referenced">WhereClause</span></span> = &lt;<span class="cons_String">where</span>
  &lt;<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_39_4" title="Defined at ../../core/strategies-namespaced.sdf3 line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;&gt; { }
  <a href="#StrategoLang-RuleCond_37_5" id="StrategoLang-RuleCond_40_3" title="Referenced at line 37">StrategoLang-RuleCond</a>.<span class="cons_Constructor"><span id="WithClause_40_25" title="Not referenced">WithClause</span></span> = &lt;<span class="cons_String">with</span>
  &lt;<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-Strategy_54_7" id="StrategoLang-Strategy_41_4" title="Defined at ../../core/strategies-namespaced.sdf3 line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;&gt; { }

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
