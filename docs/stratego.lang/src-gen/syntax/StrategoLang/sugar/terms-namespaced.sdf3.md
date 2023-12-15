---
title: terms-namespaced.sdf3
hide:
  - toc
---

# `terms-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/terms-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/terms-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/sugar/terms-namespaced_1_8" title="Multi-file references" data-urls="../main-namespaced.sdf3/#StrategoLang/sugar/terms-namespaced_9_3 line 9; ../rules-namespaced.sdf3/#StrategoLang/sugar/terms-namespaced_8_3 line 8; ../strategies-namespaced.sdf3/#StrategoLang/sugar/terms-namespaced_8_3 line 8; ../../deduplicated-namespaced.sdf3/#StrategoLang/sugar/terms-namespaced_7_3 line 7; ../../gradual-types/terms-namespaced.sdf3/#StrategoLang/sugar/terms-namespaced_5_3 line 5">StrategoLang/sugar/terms-namespaced</button>

<span class="keyword">imports</span>
  <a href="../../core/terms-namespaced.sdf3/#StrategoLang/core/terms-namespaced_1_8" id="StrategoLang/core/terms-namespaced_4_3" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>        
  <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_5_3" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../constants-namespaced.sdf3/#StrategoLang/sugar/constants-namespaced_1_8" id="StrategoLang/sugar/constants-namespaced_6_3" title="Defined at ../constants-namespaced.sdf3 line 1">StrategoLang/sugar/constants-namespaced</a>        
  <a href="../strategies-namespaced.sdf3/#StrategoLang/sugar/strategies-namespaced_1_8" id="StrategoLang/sugar/strategies-namespaced_7_3" title="Defined at ../strategies-namespaced.sdf3 line 1">StrategoLang/sugar/strategies-namespaced</a>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-ID_11_3" title="Not referenced">StrategoLang-ID</span>.<span class="cons_Constructor"><span id="ListVar_11_19" title="Not referenced">ListVar</span></span> = <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang-LId_28_3" id="StrategoLang-LId_11_29" title="Defined at ../../core/identifiers-namespaced.sdf3 line 28">StrategoLang-LId</a> { }

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Term_15_39" id="StrategoLang-Term_15_3" title="Referenced at line 15, 16, 18, 24, 26, 27, 28, 35, 39, 41, 42, 44">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#BuildDefault_44_53" id="BuildDefault_15_21" title="Referenced at line 44">BuildDefault</a></span> = &lt;<span class="cons_String">_</span>&lt;<a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_15_39" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-Term_15_39" id="StrategoLang-Term_16_3" title="Referenced at line 15, 16, 18, 24, 26, 27, 28, 35, 39, 41, 42, 44">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#AnnoList_39_21" id="AnnoList_16_21" title="Referenced at line 39">AnnoList</a></span> = &lt;&lt;<a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_16_34" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>&gt;<span class="cons_String">{</span>&lt;{<a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_16_58" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">}</span>&gt; { }
  <a href="#StrategoLang-Term_15_39" id="StrategoLang-Term_17_3" title="Referenced at line 15, 16, 18, 24, 26, 27, 28, 35, 39, 41, 42, 44">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#NoAnnoList_35_21" id="NoAnnoList_17_21" title="Referenced at line 35">NoAnnoList</a></span> = <a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_17_34" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a> { }
  <a href="#StrategoLang-Term_15_39" id="StrategoLang-Term_18_3" title="Referenced at line 15, 16, 18, 24, 26, 27, 28, 35, 39, 41, 42, 44">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#App_42_53" id="App_18_21" title="Referenced at line 42">App</a></span> = [<span class="cons_String">&lt;</span>[<a href="../strategies-namespaced.sdf3/#StrategoLang-Strategy_38_3" id="StrategoLang-Strategy_18_30" title="Defined at ../strategies-namespaced.sdf3 line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span> [<a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_18_55" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>]] { }
  <a href="#StrategoLang-Term_15_39" id="StrategoLang-Term_19_3" title="Referenced at line 15, 16, 18, 24, 26, 27, 28, 35, 39, 41, 42, 44">StrategoLang-Term</a>.<span class="cons_Constructor"><span id="RootApp_19_21" title="Not referenced">RootApp</span></span> = [<span class="cons_String">&lt;</span>[<a href="../strategies-namespaced.sdf3/#StrategoLang-Strategy_38_3" id="StrategoLang-Strategy_19_34" title="Defined at ../strategies-namespaced.sdf3 line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span>] { }

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-PreTerm_16_34" id="StrategoLang-PreTerm_23_3" title="Referenced at line 16, 17, 29, 33, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="Char_23_24" title="Not referenced">Char</span></span> = <a href="../constants-namespaced.sdf3/#StrategoLang-Char_12_3" id="StrategoLang-Char_23_31" title="Defined at ../constants-namespaced.sdf3 line 12">StrategoLang-Char</a> { }
  <a href="#StrategoLang-PreTerm_16_34" id="StrategoLang-PreTerm_24_3" title="Referenced at line 16, 17, 29, 33, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_36_61" id="AppPT_24_24" title="Referenced at line 36, 40, 41, 43">AppPT</a></span> = [<span class="cons_String">&lt;</span>[<a href="../strategies-namespaced.sdf3/#StrategoLang-Strategy_38_3" id="StrategoLang-Strategy_24_35" title="Defined at ../strategies-namespaced.sdf3 line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span> [<a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_24_60" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>]] { }
  <a href="#StrategoLang-PreTerm_16_34" id="StrategoLang-PreTerm_25_3" title="Referenced at line 16, 17, 29, 33, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#RootAppPT_37_61" id="RootAppPT_25_24" title="Referenced at line 37">RootAppPT</a></span> = [<span class="cons_String">&lt;</span>[<a href="../strategies-namespaced.sdf3/#StrategoLang-Strategy_38_3" id="StrategoLang-Strategy_25_39" title="Defined at ../strategies-namespaced.sdf3 line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span>] { }
  <a href="#StrategoLang-PreTerm_16_34" id="StrategoLang-PreTerm_26_3" title="Referenced at line 16, 17, 29, 33, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="Tuple_26_24" title="Not referenced">Tuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_26_36" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-PreTerm_16_34" id="StrategoLang-PreTerm_27_3" title="Referenced at line 16, 17, 29, 33, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="List_27_24" title="Not referenced">List</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_27_35" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt; { }
  <a href="#StrategoLang-PreTerm_16_34" id="StrategoLang-PreTerm_28_3" title="Referenced at line 16, 17, 29, 33, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><span id="ListTail_28_24" title="Not referenced">ListTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_28_39" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}+&gt; <span class="cons_String">|</span> &lt;<a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_28_68" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>&gt;<span class="cons_String">]</span>&gt; { }
  <a href="#StrategoLang-PreTerm_16_34" id="StrategoLang-PreTerm_29_3" title="Referenced at line 16, 17, 29, 33, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#BuildDefaultPT_38_61" id="BuildDefaultPT_29_24" title="Referenced at line 38, 45">BuildDefaultPT</a></span> = &lt;<span class="cons_String">_</span>&lt;<a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_29_44" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>&gt;&gt; { }

<span class="keyword">context-free priorities</span>

  <a href="#StrategoLang-Term_15_39" id="StrategoLang-Term_33_3" title="Referenced at line 15, 16, 18, 24, 26, 27, 28, 35, 39, 41, 42, 44">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#NoAnnoList_35_21" id="NoAnnoList_33_21" title="Referenced at line 35">NoAnnoList</a></span> = <a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_33_34" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a> { } &lt;0&gt;. &gt; {<a href="#StrategoLang-PreTerm_16_34" id="StrategoLang-PreTerm_33_67" title="Referenced at line 16, 17, 29, 33, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45">StrategoLang-PreTerm</a> = <a href="../../core/terms-namespaced.sdf3/#StrategoLang-Var_7_23" id="StrategoLang-Var_33_90" title="Defined at ../../core/terms-namespaced.sdf3 line 7, 11">StrategoLang-Var</a> { }
                                                                  <a href="#StrategoLang-PreTerm_16_34" id="StrategoLang-PreTerm_34_67" title="Referenced at line 16, 17, 29, 33, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45">StrategoLang-PreTerm</a> = <a href="../../core/terms-namespaced.sdf3/#StrategoLang-Wld_7_40" id="StrategoLang-Wld_34_90" title="Defined at ../../core/terms-namespaced.sdf3 line 7, 13">StrategoLang-Wld</a> { }},
  <a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_35_3" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#NoAnnoList_17_21" id="NoAnnoList_35_21" title="Defined at line 17, 33">NoAnnoList</a></span> &lt;0&gt;. &gt; {<a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_35_40" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="../../core/terms-namespaced.sdf3/#AsPT_36_24" id="AsPT_35_61" title="Defined at ../../core/terms-namespaced.sdf3 line 36">AsPT</a></span>
                                       <a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_36_40" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_24_24" id="AppPT_36_61" title="Defined at line 24">AppPT</a></span>
                                       <a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_37_40" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#RootAppPT_25_24" id="RootAppPT_37_61" title="Defined at line 25">RootAppPT</a></span>
                                       <a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_38_40" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#BuildDefaultPT_29_24" id="BuildDefaultPT_38_61" title="Defined at line 29">BuildDefaultPT</a></span>},
  <a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_39_3" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#AnnoList_16_21" id="AnnoList_39_21" title="Defined at line 16">AnnoList</a></span> &gt; {<a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_39_33" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="../../core/terms-namespaced.sdf3/#AsPT_36_24" id="AsPT_39_54" title="Defined at ../../core/terms-namespaced.sdf3 line 36">AsPT</a></span>
                                <a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_40_33" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_24_24" id="AppPT_40_54" title="Defined at line 24">AppPT</a></span>},
  <a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_41_3" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="../../core/terms-namespaced.sdf3/#Anno_21_21" id="Anno_41_21" title="Defined at ../../core/terms-namespaced.sdf3 line 21">Anno</a></span> &gt; <a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_41_28" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_24_24" id="AppPT_41_49" title="Defined at line 24">AppPT</a></span>,
  <a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_42_3" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="../../core/terms-namespaced.sdf3/#Explode_35_24" id="Explode_42_24" title="Defined at ../../core/terms-namespaced.sdf3 line 35">Explode</a></span> &gt; {<a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_42_35" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#App_18_21" id="App_42_53" title="Defined at line 18">App</a></span>
                                  <a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_43_35" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_24_24" id="AppPT_43_56" title="Defined at line 24">AppPT</a></span>
                                  <a href="#StrategoLang-Term_15_3" id="StrategoLang-Term_44_35" title="Defined at line 15, 16, 17, 18, 19, 33">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#BuildDefault_15_21" id="BuildDefault_44_53" title="Defined at line 15">BuildDefault</a></span>
                                  <a href="#StrategoLang-PreTerm_23_3" id="StrategoLang-PreTerm_45_35" title="Defined at line 23, 24, 25, 26, 27, 28, 29, 33, 34">StrategoLang-PreTerm</a>.<span class="cons_Constructor"><a href="#BuildDefaultPT_29_24" id="BuildDefaultPT_45_56" title="Defined at line 29">BuildDefaultPT</a></span>}

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
