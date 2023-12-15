---
title: terms.sdf3
hide:
  - toc
---

# `terms.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/core/terms.sdf3]

[pdmosses/stratego/stratego.lang/syntax/core/terms.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/core/terms.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="core/terms_1_8" title="Multi-file references" data-urls="../main.sdf3/#core/terms_8_3 line 8; ../strategies.sdf3/#core/terms_4_3 line 4; ../../deduplicated.sdf3/#core/terms_4_3 line 4; ../../gradual-types/strategies.sdf3/#core/terms_7_3 line 7; ../../gradual-types/terms.sdf3/#core/terms_3_3 line 3; ../../sugar/dynamic-rules.sdf3/#core/terms_5_3 line 5; ../../sugar/overlays.sdf3/#core/terms_4_3 line 4; ../../sugar/rules.sdf3/#core/terms_6_5 line 6; ../../sugar/strategies.sdf3/#core/terms_6_3 line 6; ../../sugar/string-quotations.sdf3/#core/terms_3_9 line 3; ../../sugar/terms.sdf3/#core/terms_3_3 line 3">core/terms</button>

<span class="keyword">imports</span>
  <a href="../identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_4_3" title="Defined at ../identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../constants.sdf3/#core/constants_1_8" id="core/constants_5_3" title="Defined at ../constants.sdf3 line 1">core/constants</a>

<span class="keyword">context-free sorts</span> <button class="modal-open" id="ID_7_20" title="Multi-file references" data-urls="#ID_9_13 line 9; ../strategies.sdf3/#ID_50_22 line 50, 61; ../../gradual-types/strategies.sdf3/#ID_44_33 line 44">ID</button> <button class="modal-open" id="Var_7_23" title="Multi-file references" data-urls="#Var_16_15 line 16, 19, 24, 33; ../../deduplicated.sdf3/#Var_23_23 line 23; ../../sugar/terms.sdf3/#Var_33_15 line 33">Var</button> <button class="modal-open" id="Wld_7_27" title="Multi-file references" data-urls="#Wld_17_15 line 17, 25; ../../sugar/terms.sdf3/#Wld_34_15 line 34">Wld</button>
<span class="keyword">context-free syntax</span>
  <button class="modal-open" id="Var_9_3" title="Multi-file references" data-urls="#Var_16_15 line 16, 19, 24, 33; ../../deduplicated.sdf3/#Var_23_23 line 23; ../../sugar/terms.sdf3/#Var_33_15 line 33">Var</button>.<span class="cons_Constructor"><span id="Var_9_7" title="Not referenced">Var</span></span> = <a href="#ID_7_20" id="ID_9_13" title="Defined at line 7, 10">ID</a>
  <button class="modal-open" id="ID_10_3" title="Multi-file references" data-urls="#ID_9_13 line 9; ../strategies.sdf3/#ID_50_22 line 50, 61; ../../gradual-types/strategies.sdf3/#ID_44_33 line 44">ID</button>      = <a href="../identifiers.sdf3/#Id_16_15" id="Id_10_13" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>
  <button class="modal-open" id="Wld_11_3" title="Multi-file references" data-urls="#Wld_17_15 line 17, 25; ../../sugar/terms.sdf3/#Wld_34_15 line 34">Wld</button>.<span class="cons_Constructor"><span id="Wld_11_7" title="Not referenced">Wld</span></span> = <span class="cons_Lit">"_"</span>

<span class="keyword">context-free sorts</span> <button class="modal-open" id="Term_13_20" title="Multi-file references" data-urls="#Term_19_23 line 19, 30, 31, 32, 36, 37; ../strategies.sdf3/#Term_57_53 line 57, 59, 60, 64, 79, 82; ../../deduplicated.sdf3/#Term_36_38 line 36; ../../sugar/dynamic-rules.sdf3/#Term_23_32 line 23, 31, 33, 39, 41, 43, 45, 47, 49, 52, 66; ../../sugar/overlays.sdf3/#Term_8_36 line 8, 11; ../../sugar/rules.sdf3/#Term_35_30 line 35, 42; ../../sugar/string-quotations.sdf3/#Term_69_55 line 69, 70, 71, 72, 89, 90, 91, 92">Term</button> <span class="layout">// term with annotations</span>
<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Term_16_3" title="Multi-file references" data-urls="#Term_19_23 line 19, 30, 31, 32, 36, 37; ../strategies.sdf3/#Term_57_53 line 57, 59, 60, 64, 79, 82; ../../deduplicated.sdf3/#Term_36_38 line 36; ../../sugar/dynamic-rules.sdf3/#Term_23_32 line 23, 31, 33, 39, 41, 43, 45, 47, 49, 52, 66; ../../sugar/overlays.sdf3/#Term_8_36 line 8, 11; ../../sugar/rules.sdf3/#Term_35_30 line 35, 42; ../../sugar/string-quotations.sdf3/#Term_69_55 line 69, 70, 71, 72, 89, 90, 91, 92">Term</button>      = <a href="#Var_7_23" id="Var_16_15" title="Defined at line 7, 9">Var</a>
  <button class="modal-open" id="Term_17_3" title="Multi-file references" data-urls="#Term_19_23 line 19, 30, 31, 32, 36, 37; ../strategies.sdf3/#Term_57_53 line 57, 59, 60, 64, 79, 82; ../../deduplicated.sdf3/#Term_36_38 line 36; ../../sugar/dynamic-rules.sdf3/#Term_23_32 line 23, 31, 33, 39, 41, 43, 45, 47, 49, 52, 66; ../../sugar/overlays.sdf3/#Term_8_36 line 8, 11; ../../sugar/rules.sdf3/#Term_35_30 line 35, 42; ../../sugar/string-quotations.sdf3/#Term_69_55 line 69, 70, 71, 72, 89, 90, 91, 92">Term</button>      = <a href="#Wld_7_27" id="Wld_17_15" title="Defined at line 7, 11">Wld</a>
  <button class="modal-open" id="Term_18_3" title="Multi-file references" data-urls="#Term_19_23 line 19, 30, 31, 32, 36, 37; ../strategies.sdf3/#Term_57_53 line 57, 59, 60, 64, 79, 82; ../../deduplicated.sdf3/#Term_36_38 line 36; ../../sugar/dynamic-rules.sdf3/#Term_23_32 line 23, 31, 33, 39, 41, 43, 45, 47, 49, 52, 66; ../../sugar/overlays.sdf3/#Term_8_36 line 8, 11; ../../sugar/rules.sdf3/#Term_35_30 line 35, 42; ../../sugar/string-quotations.sdf3/#Term_69_55 line 69, 70, 71, 72, 89, 90, 91, 92">Term</button>.<span class="cons_Constructor"><button class="modal-open" id="Anno_18_8" title="Multi-file references" data-urls="#Anno_37_8 line 37; ../../sugar/terms.sdf3/#Anno_47_8 line 47">Anno</button></span> = &lt;&lt;<a href="#PreTerm_21_20" id="PreTerm_18_17" title="Defined at line 21, 24, 25, 27, 28, 29, 30, 31, 32, 33">PreTerm</a>&gt;<span class="cons_String">{^</span>&lt;<a href="#PreTerm_21_20" id="PreTerm_18_28" title="Defined at line 21, 24, 25, 27, 28, 29, 30, 31, 32, 33">PreTerm</a>&gt;<span class="cons_String">}</span>&gt;
  <button class="modal-open" id="Term_19_3" title="Multi-file references" data-urls="#Term_19_23 line 19, 30, 31, 32, 36, 37; ../strategies.sdf3/#Term_57_53 line 57, 59, 60, 64, 79, 82; ../../deduplicated.sdf3/#Term_36_38 line 36; ../../sugar/dynamic-rules.sdf3/#Term_23_32 line 23, 31, 33, 39, 41, 43, 45, 47, 49, 52, 66; ../../sugar/overlays.sdf3/#Term_8_36 line 8, 11; ../../sugar/rules.sdf3/#Term_35_30 line 35, 42; ../../sugar/string-quotations.sdf3/#Term_69_55 line 69, 70, 71, 72, 89, 90, 91, 92">Term</button>.<span class="cons_Constructor"><a href="#As_36_26" id="As_19_8" title="Referenced at line 36">As</a></span>   = &lt;&lt;<a href="#Var_7_23" id="Var_19_17" title="Defined at line 7, 9">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#Term_13_20" id="Term_19_23" title="Defined at line 13, 16, 17, 18, 19">Term</a>&gt;&gt;

<span class="keyword">context-free sorts</span> <button class="modal-open" id="PreTerm_21_20" title="Multi-file references" data-urls="#PreTerm_18_17 line 18, 33, 36, 37; ../../gradual-types/terms.sdf3/#PreTerm_13_14 line 13">PreTerm</button> <span class="layout">// term without annotations</span>
<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="PreTerm_24_3" title="Multi-file references" data-urls="#PreTerm_18_17 line 18, 33, 36, 37; ../../gradual-types/terms.sdf3/#PreTerm_13_14 line 13">PreTerm</button>         = <a href="#Var_7_23" id="Var_24_21" title="Defined at line 7, 9">Var</a>
  <button class="modal-open" id="PreTerm_25_3" title="Multi-file references" data-urls="#PreTerm_18_17 line 18, 33, 36, 37; ../../gradual-types/terms.sdf3/#PreTerm_13_14 line 13">PreTerm</button>         = <a href="#Wld_7_27" id="Wld_25_21" title="Defined at line 7, 11">Wld</a>

  <button class="modal-open" id="PreTerm_27_3" title="Multi-file references" data-urls="#PreTerm_18_17 line 18, 33, 36, 37; ../../gradual-types/terms.sdf3/#PreTerm_13_14 line 13">PreTerm</button>.<span class="cons_Constructor"><span id="Int_27_11" title="Not referenced">Int</span></span>     = <a href="../constants.sdf3/#Int_3_15" id="Int_27_21" title="Defined at ../constants.sdf3 line 3, 5">Int</a>
  <button class="modal-open" id="PreTerm_28_3" title="Multi-file references" data-urls="#PreTerm_18_17 line 18, 33, 36, 37; ../../gradual-types/terms.sdf3/#PreTerm_13_14 line 13">PreTerm</button>.<span class="cons_Constructor"><span id="Real_28_11" title="Not referenced">Real</span></span>    = <a href="../constants.sdf3/#Real_3_19" id="Real_28_21" title="Defined at ../constants.sdf3 line 3, 7">Real</a>
  <button class="modal-open" id="PreTerm_29_3" title="Multi-file references" data-urls="#PreTerm_18_17 line 18, 33, 36, 37; ../../gradual-types/terms.sdf3/#PreTerm_13_14 line 13">PreTerm</button>.<span class="cons_Constructor"><span id="Str_29_11" title="Not referenced">Str</span></span>     = <a href="../constants.sdf3/#String_3_24" id="String_29_21" title="Defined at ../constants.sdf3 line 3, 9">String</a>
  <button class="modal-open" id="PreTerm_30_3" title="Multi-file references" data-urls="#PreTerm_18_17 line 18, 33, 36, 37; ../../gradual-types/terms.sdf3/#PreTerm_13_14 line 13">PreTerm</button>.<span class="cons_Constructor"><span id="Op_30_11" title="Not referenced">Op</span></span>      = &lt;&lt;<a href="../identifiers.sdf3/#Id_16_15" id="Id_30_23" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Term_13_20" id="Term_30_29" title="Defined at line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="PreTerm_31_3" title="Multi-file references" data-urls="#PreTerm_18_17 line 18, 33, 36, 37; ../../gradual-types/terms.sdf3/#PreTerm_13_14 line 13">PreTerm</button>.<span class="cons_Constructor"><span id="OpQ_31_11" title="Not referenced">OpQ</span></span>     = &lt;&lt;<a href="../constants.sdf3/#String_3_24" id="String_31_23" title="Defined at ../constants.sdf3 line 3, 9">String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Term_13_20" id="Term_31_33" title="Defined at line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="PreTerm_32_3" title="Multi-file references" data-urls="#PreTerm_18_17 line 18, 33, 36, 37; ../../gradual-types/terms.sdf3/#PreTerm_13_14 line 13">PreTerm</button>.<span class="cons_Constructor"><button class="modal-open" id="Explode_32_11" title="Multi-file references" data-urls="#Explode_36_11 line 36; ../../sugar/terms.sdf3/#Explode_48_11 line 48">Explode</button></span> = &lt;&lt;<a href="#Term_13_20" id="Term_32_23" title="Defined at line 13, 16, 17, 18, 19">Term</a>&gt;<span class="cons_String">#(</span>&lt;<a href="#Term_13_20" id="Term_32_31" title="Defined at line 13, 16, 17, 18, 19">Term</a>&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="PreTerm_33_3" title="Multi-file references" data-urls="#PreTerm_18_17 line 18, 33, 36, 37; ../../gradual-types/terms.sdf3/#PreTerm_13_14 line 13">PreTerm</button>.<span class="cons_Constructor"><button class="modal-open" id="AsPT_33_11" title="Multi-file references" data-urls="#AsPT_37_23 line 37; ../../sugar/terms.sdf3/#AsPT_37_13 line 37, 44">AsPT</button></span>    = &lt;&lt;<a href="#Var_7_23" id="Var_33_23" title="Defined at line 7, 9">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#PreTerm_21_20" id="PreTerm_33_29" title="Defined at line 21, 24, 25, 27, 28, 29, 30, 31, 32, 33">PreTerm</a>&gt;&gt;

<span class="keyword">context-free priorities</span>
  <a href="#PreTerm_21_20" id="PreTerm_36_3" title="Defined at line 21, 24, 25, 27, 28, 29, 30, 31, 32, 33">PreTerm</a>.<span class="cons_Constructor"><a href="#Explode_32_11" id="Explode_36_11" title="Defined at line 32">Explode</a></span> &gt; <a href="#Term_13_20" id="Term_36_21" title="Defined at line 13, 16, 17, 18, 19">Term</a>.<span class="cons_Constructor"><a href="#As_19_8" id="As_36_26" title="Defined at line 19">As</a></span>,
  <a href="#Term_13_20" id="Term_37_3" title="Defined at line 13, 16, 17, 18, 19">Term</a>.<span class="cons_Constructor"><a href="#Anno_18_8" id="Anno_37_8" title="Defined at line 18">Anno</a></span> &gt; <a href="#PreTerm_21_20" id="PreTerm_37_15" title="Defined at line 21, 24, 25, 27, 28, 29, 30, 31, 32, 33">PreTerm</a>.<span class="cons_Constructor"><a href="#AsPT_33_11" id="AsPT_37_23" title="Defined at line 33">AsPT</a></span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
