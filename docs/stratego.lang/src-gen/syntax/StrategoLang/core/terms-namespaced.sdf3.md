---
title: terms-namespaced.sdf3
hide:
  - toc
---

# `terms-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/core/terms-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/core/terms-namespaced.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/core/terms-namespaced_1_8" title="Multi-file references" data-urls="../main-namespaced.sdf3/#StrategoLang/core/terms-namespaced_8_3 line 8; ../strategies-namespaced.sdf3/#StrategoLang/core/terms-namespaced_4_3 line 4; ../../deduplicated-namespaced.sdf3/#StrategoLang/core/terms-namespaced_4_3 line 4; ../../gradual-types/strategies-namespaced.sdf3/#StrategoLang/core/terms-namespaced_7_3 line 7; ../../gradual-types/terms-namespaced.sdf3/#StrategoLang/core/terms-namespaced_4_3 line 4; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang/core/terms-namespaced_5_3 line 5; ../../sugar/overlays-namespaced.sdf3/#StrategoLang/core/terms-namespaced_5_3 line 5; ../../sugar/rules-namespaced.sdf3/#StrategoLang/core/terms-namespaced_6_3 line 6; ../../sugar/strategies-namespaced.sdf3/#StrategoLang/core/terms-namespaced_7_3 line 7; ../../sugar/string-quotations-namespaced.sdf3/#StrategoLang/core/terms-namespaced_4_3 line 4; ../../sugar/terms-namespaced.sdf3/#StrategoLang/core/terms-namespaced_4_3 line 4">StrategoLang/core/terms-namespaced</button>

<span class="keyword">imports</span>
  <a href="../identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_4_3" title="Defined at ../identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../constants-namespaced.sdf3/#StrategoLang/core/constants-namespaced_1_8" id="StrategoLang/core/constants-namespaced_5_3" title="Defined at ../constants-namespaced.sdf3 line 1">StrategoLang/core/constants-namespaced</a>

<span class="keyword">sorts</span> <button class="modal-open" id="StrategoLang-ID_7_7" title="Multi-file references" data-urls="#StrategoLang-ID_11_26 line 11; ../../gradual-types/strategies-namespaced.sdf3/#StrategoLang-ID_36_86 line 36; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-ID_32_40 line 32">StrategoLang-ID</button> <button class="modal-open" id="StrategoLang-Var_7_23" title="Multi-file references" data-urls="#StrategoLang-Var_19_23 line 19, 22, 28, 36; ../../deduplicated-namespaced.sdf3/#StrategoLang-Var_17_31 line 17; ../../sugar/terms-namespaced.sdf3/#StrategoLang-Var_33_90 line 33">StrategoLang-Var</button> <button class="modal-open" id="StrategoLang-Wld_7_40" title="Multi-file references" data-urls="#StrategoLang-Wld_20_23 line 20, 29; ../../sugar/terms-namespaced.sdf3/#StrategoLang-Wld_34_90 line 34">StrategoLang-Wld</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="StrategoLang-Var_11_3" title="Multi-file references" data-urls="#StrategoLang-Var_19_23 line 19, 22, 28, 36; ../../deduplicated-namespaced.sdf3/#StrategoLang-Var_17_31 line 17; ../../sugar/terms-namespaced.sdf3/#StrategoLang-Var_33_90 line 33">StrategoLang-Var</button>.<span class="cons_Constructor"><span id="Var_11_20" title="Not referenced">Var</span></span> = <a href="#StrategoLang-ID_7_7" id="StrategoLang-ID_11_26" title="Defined at line 7, 12">StrategoLang-ID</a> { }
  <button class="modal-open" id="StrategoLang-ID_12_3" title="Multi-file references" data-urls="#StrategoLang-ID_11_26 line 11; ../../gradual-types/strategies-namespaced.sdf3/#StrategoLang-ID_36_86 line 36; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-ID_32_40 line 32">StrategoLang-ID</button> = <a href="../identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_12_21" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a> { }
  <button class="modal-open" id="StrategoLang-Wld_13_3" title="Multi-file references" data-urls="#StrategoLang-Wld_20_23 line 20, 29; ../../sugar/terms-namespaced.sdf3/#StrategoLang-Wld_34_90 line 34">StrategoLang-Wld</button>.<span class="cons_Constructor"><span id="Wld_13_20" title="Not referenced">Wld</span></span> = <span class="cons_Lit">"_"</span> { }

<span class="keyword">sorts</span> <button class="modal-open" id="StrategoLang-Term_15_7" title="Multi-file references" data-urls="#StrategoLang-Term_22_47 line 22, 33, 34, 35, 40, 41; ../../deduplicated-namespaced.sdf3/#StrategoLang-Term_30_58 line 30; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-Term_23_45 line 23, 30, 31, 34, 35, 36, 37, 38, 39, 41, 57; ../../sugar/overlays-namespaced.sdf3/#StrategoLang-Term_11_62 line 11, 12; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Term_28_85 line 28, 36; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-Term_26_83 line 26, 42, 51, 66, 67; ../../sugar/string-quotations-namespaced.sdf3/#StrategoLang-Term_58_68 line 58, 59, 60, 61, 71, 72, 73, 74">StrategoLang-Term</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="StrategoLang-Term_19_3" title="Multi-file references" data-urls="#StrategoLang-Term_22_47 line 22, 33, 34, 35, 40, 41; ../../deduplicated-namespaced.sdf3/#StrategoLang-Term_30_58 line 30; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-Term_23_45 line 23, 30, 31, 34, 35, 36, 37, 38, 39, 41, 57; ../../sugar/overlays-namespaced.sdf3/#StrategoLang-Term_11_62 line 11, 12; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Term_28_85 line 28, 36; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-Term_26_83 line 26, 42, 51, 66, 67; ../../sugar/string-quotations-namespaced.sdf3/#StrategoLang-Term_58_68 line 58, 59, 60, 61, 71, 72, 73, 74">StrategoLang-Term</button> = <a href="#StrategoLang-Var_7_23" id="StrategoLang-Var_19_23" title="Defined at line 7, 11">StrategoLang-Var</a> { }
  <button class="modal-open" id="StrategoLang-Term_20_3" title="Multi-file references" data-urls="#StrategoLang-Term_22_47 line 22, 33, 34, 35, 40, 41; ../../deduplicated-namespaced.sdf3/#StrategoLang-Term_30_58 line 30; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-Term_23_45 line 23, 30, 31, 34, 35, 36, 37, 38, 39, 41, 57; ../../sugar/overlays-namespaced.sdf3/#StrategoLang-Term_11_62 line 11, 12; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Term_28_85 line 28, 36; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-Term_26_83 line 26, 42, 51, 66, 67; ../../sugar/string-quotations-namespaced.sdf3/#StrategoLang-Term_58_68 line 58, 59, 60, 61, 71, 72, 73, 74">StrategoLang-Term</button> = <a href="#StrategoLang-Wld_7_40" id="StrategoLang-Wld_20_23" title="Defined at line 7, 13">StrategoLang-Wld</a> { }
  <button class="modal-open" id="StrategoLang-Term_21_3" title="Multi-file references" data-urls="#StrategoLang-Term_22_47 line 22, 33, 34, 35, 40, 41; ../../deduplicated-namespaced.sdf3/#StrategoLang-Term_30_58 line 30; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-Term_23_45 line 23, 30, 31, 34, 35, 36, 37, 38, 39, 41, 57; ../../sugar/overlays-namespaced.sdf3/#StrategoLang-Term_11_62 line 11, 12; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Term_28_85 line 28, 36; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-Term_26_83 line 26, 42, 51, 66, 67; ../../sugar/string-quotations-namespaced.sdf3/#StrategoLang-Term_58_68 line 58, 59, 60, 61, 71, 72, 73, 74">StrategoLang-Term</button>.<span class="cons_Constructor"><button class="modal-open" id="Anno_21_21" title="Multi-file references" data-urls="#Anno_41_21 line 41; ../../sugar/terms-namespaced.sdf3/#Anno_41_21 line 41">Anno</button></span> = &lt;&lt;<a href="#StrategoLang-PreTerm_24_7" id="StrategoLang-PreTerm_21_30" title="Defined at line 24, 28, 29, 30, 31, 32, 33, 34, 35, 36">StrategoLang-PreTerm</a>&gt;<span class="cons_String">{^</span>&lt;<a href="#StrategoLang-PreTerm_24_7" id="StrategoLang-PreTerm_21_54" title="Defined at line 24, 28, 29, 30, 31, 32, 33, 34, 35, 36">StrategoLang-PreTerm</a>&gt;<span class="cons_String">}</span>&gt; { }
  <button class="modal-open" id="StrategoLang-Term_22_3" title="Multi-file references" data-urls="#StrategoLang-Term_22_47 line 22, 33, 34, 35, 40, 41; ../../deduplicated-namespaced.sdf3/#StrategoLang-Term_30_58 line 30; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-Term_23_45 line 23, 30, 31, 34, 35, 36, 37, 38, 39, 41, 57; ../../sugar/overlays-namespaced.sdf3/#StrategoLang-Term_11_62 line 11, 12; ../../sugar/rules-namespaced.sdf3/#StrategoLang-Term_28_85 line 28, 36; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-Term_26_83 line 26, 42, 51, 66, 67; ../../sugar/string-quotations-namespaced.sdf3/#StrategoLang-Term_58_68 line 58, 59, 60, 61, 71, 72, 73, 74">StrategoLang-Term</button>.<span class="cons_Constructor"><a href="#As_40_52" id="As_22_21" title="Referenced at line 40">As</a></span> = &lt;&lt;<a href="#StrategoLang-Var_7_23" id="StrategoLang-Var_22_28" title="Defined at line 7, 11">StrategoLang-Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#StrategoLang-Term_15_7" id="StrategoLang-Term_22_47" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }

<span class="keyword">sorts</span> <button class="modal-open" id="StrategoLang-PreTerm_24_7" title="Multi-file references" data-urls="#StrategoLang-PreTerm_21_30 line 21, 36, 40, 41; ../../gradual-types/terms-namespaced.sdf3/#StrategoLang-PreTerm_15_4 line 15">StrategoLang-PreTerm</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="StrategoLang-PreTerm_28_3" title="Multi-file references" data-urls="#StrategoLang-PreTerm_21_30 line 21, 36, 40, 41; ../../gradual-types/terms-namespaced.sdf3/#StrategoLang-PreTerm_15_4 line 15">StrategoLang-PreTerm</button> = <a href="#StrategoLang-Var_7_23" id="StrategoLang-Var_28_26" title="Defined at line 7, 11">StrategoLang-Var</a> { }
  <button class="modal-open" id="StrategoLang-PreTerm_29_3" title="Multi-file references" data-urls="#StrategoLang-PreTerm_21_30 line 21, 36, 40, 41; ../../gradual-types/terms-namespaced.sdf3/#StrategoLang-PreTerm_15_4 line 15">StrategoLang-PreTerm</button> = <a href="#StrategoLang-Wld_7_40" id="StrategoLang-Wld_29_26" title="Defined at line 7, 13">StrategoLang-Wld</a> { }
  <button class="modal-open" id="StrategoLang-PreTerm_30_3" title="Multi-file references" data-urls="#StrategoLang-PreTerm_21_30 line 21, 36, 40, 41; ../../gradual-types/terms-namespaced.sdf3/#StrategoLang-PreTerm_15_4 line 15">StrategoLang-PreTerm</button>.<span class="cons_Constructor"><span id="Int_30_24" title="Not referenced">Int</span></span> = <a href="../constants-namespaced.sdf3/#StrategoLang-Int_8_3" id="StrategoLang-Int_30_30" title="Defined at ../constants-namespaced.sdf3 line 8">StrategoLang-Int</a> { }
  <button class="modal-open" id="StrategoLang-PreTerm_31_3" title="Multi-file references" data-urls="#StrategoLang-PreTerm_21_30 line 21, 36, 40, 41; ../../gradual-types/terms-namespaced.sdf3/#StrategoLang-PreTerm_15_4 line 15">StrategoLang-PreTerm</button>.<span class="cons_Constructor"><span id="Real_31_24" title="Not referenced">Real</span></span> = <a href="../constants-namespaced.sdf3/#StrategoLang-Real_9_3" id="StrategoLang-Real_31_31" title="Defined at ../constants-namespaced.sdf3 line 9">StrategoLang-Real</a> { }
  <button class="modal-open" id="StrategoLang-PreTerm_32_3" title="Multi-file references" data-urls="#StrategoLang-PreTerm_21_30 line 21, 36, 40, 41; ../../gradual-types/terms-namespaced.sdf3/#StrategoLang-PreTerm_15_4 line 15">StrategoLang-PreTerm</button>.<span class="cons_Constructor"><span id="Str_32_24" title="Not referenced">Str</span></span> = <a href="../constants-namespaced.sdf3/#StrategoLang-String_10_3" id="StrategoLang-String_32_30" title="Defined at ../constants-namespaced.sdf3 line 10">StrategoLang-String</a> { }
  <button class="modal-open" id="StrategoLang-PreTerm_33_3" title="Multi-file references" data-urls="#StrategoLang-PreTerm_21_30 line 21, 36, 40, 41; ../../gradual-types/terms-namespaced.sdf3/#StrategoLang-PreTerm_15_4 line 15">StrategoLang-PreTerm</button>.<span class="cons_Constructor"><span id="Op_33_24" title="Not referenced">Op</span></span> = &lt;&lt;<a href="../identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_33_31" title="Defined at ../identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Term_15_7" id="StrategoLang-Term_33_50" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <button class="modal-open" id="StrategoLang-PreTerm_34_3" title="Multi-file references" data-urls="#StrategoLang-PreTerm_21_30 line 21, 36, 40, 41; ../../gradual-types/terms-namespaced.sdf3/#StrategoLang-PreTerm_15_4 line 15">StrategoLang-PreTerm</button>.<span class="cons_Constructor"><span id="OpQ_34_24" title="Not referenced">OpQ</span></span> = &lt;&lt;<a href="../constants-namespaced.sdf3/#StrategoLang-String_10_3" id="StrategoLang-String_34_32" title="Defined at ../constants-namespaced.sdf3 line 10">StrategoLang-String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Term_15_7" id="StrategoLang-Term_34_55" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <button class="modal-open" id="StrategoLang-PreTerm_35_3" title="Multi-file references" data-urls="#StrategoLang-PreTerm_21_30 line 21, 36, 40, 41; ../../gradual-types/terms-namespaced.sdf3/#StrategoLang-PreTerm_15_4 line 15">StrategoLang-PreTerm</button>.<span class="cons_Constructor"><button class="modal-open" id="Explode_35_24" title="Multi-file references" data-urls="#Explode_40_24 line 40; ../../sugar/terms-namespaced.sdf3/#Explode_42_24 line 42">Explode</button></span> = &lt;&lt;<a href="#StrategoLang-Term_15_7" id="StrategoLang-Term_35_36" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;<span class="cons_String">#(</span>&lt;<a href="#StrategoLang-Term_15_7" id="StrategoLang-Term_35_57" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;<span class="cons_String">)</span>&gt; { }
  <button class="modal-open" id="StrategoLang-PreTerm_36_3" title="Multi-file references" data-urls="#StrategoLang-PreTerm_21_30 line 21, 36, 40, 41; ../../gradual-types/terms-namespaced.sdf3/#StrategoLang-PreTerm_15_4 line 15">StrategoLang-PreTerm</button>.<span class="cons_Constructor"><button class="modal-open" id="AsPT_36_24" title="Multi-file references" data-urls="#AsPT_41_49 line 41; ../../sugar/terms-namespaced.sdf3/#AsPT_35_61 line 35, 39">AsPT</button></span> = &lt;&lt;<a href="#StrategoLang-Var_7_23" id="StrategoLang-Var_36_33" title="Defined at line 7, 11">StrategoLang-Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#StrategoLang-PreTerm_24_7" id="StrategoLang-PreTerm_36_52" title="Defined at line 24, 28, 29, 30, 31, 32, 33, 34, 35, 36">StrategoLang-PreTerm</a>&gt;&gt; { }

<span class="keyword">context-free priorities</span>

  <a href="#StrategoLang-PreTerm_24_7" id="StrategoLang-PreTerm_40_3" title="Defined at line 24, 28, 29, 30, 31, 32, 33, 34, 35, 36">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#Explode_35_24" id="Explode_40_24" title="Defined at line 35">Explode</a></span> &gt; <a href="#StrategoLang-Term_15_7" id="StrategoLang-Term_40_34" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#As_22_21" id="As_40_52" title="Defined at line 22">As</a></span>,
  <a href="#StrategoLang-Term_15_7" id="StrategoLang-Term_41_3" title="Defined at line 15, 19, 20, 21, 22">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#Anno_21_21" id="Anno_41_21" title="Defined at line 21">Anno</a></span> &gt; <a href="#StrategoLang-PreTerm_24_7" id="StrategoLang-PreTerm_41_28" title="Defined at line 24, 28, 29, 30, 31, 32, 33, 34, 35, 36">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AsPT_36_24" id="AsPT_41_49" title="Defined at line 36">AsPT</a></span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
