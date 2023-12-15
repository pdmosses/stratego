---
title: strategies-namespaced.sdf3
hide:
  - toc
---

# `strategies-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/strategies-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/strategies-namespaced.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/gradual-types/strategies-namespaced_1_8" title="Multi-file references" data-urls="../main-namespaced.sdf3/#StrategoLang/gradual-types/strategies-namespaced_6_3 line 6; ../../deduplicated-namespaced.sdf3/#StrategoLang/gradual-types/strategies-namespaced_13_3 line 13">StrategoLang/gradual-types/strategies-namespaced</button>

<span class="keyword">imports</span>
  <a href="../signatures-namespaced.sdf3/#StrategoLang/gradual-types/signatures-namespaced_1_8" id="StrategoLang/gradual-types/signatures-namespaced_4_3" title="Defined at ../signatures-namespaced.sdf3 line 1">StrategoLang/gradual-types/signatures-namespaced</a>        
  <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_5_3" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/strategies-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_1_8" id="StrategoLang/core/strategies-namespaced_6_3" title="Defined at ../../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../../core/terms-namespaced.sdf3/#StrategoLang/core/terms-namespaced_1_8" id="StrategoLang/core/terms-namespaced_7_3" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <span class="keyword">tokenize</span> : ")(|"

<span class="keyword">sorts</span> <a href="#StrategoLang-Coercion_18_39" id="StrategoLang-Coercion_14_7" title="Referenced at line 18, 27, 28">StrategoLang-Coercion</a> <a href="#StrategoLang-SCoercion_28_40" id="StrategoLang-SCoercion_14_29" title="Referenced at line 28">StrategoLang-SCoercion</a> <a href="#StrategoLang-Proxy_26_27" id="StrategoLang-Proxy_14_52" title="Referenced at line 26">StrategoLang-Proxy</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_37_4" id="StrategoLang-Strategy_18_3" title="Referenced at line 37">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Cast_18_25" title="Not referenced">Cast</span></span> = [<span class="cons_String">cast(</span>[<a href="#StrategoLang-Coercion_14_7" id="StrategoLang-Coercion_18_39" title="Defined at line 14, 20, 21, 22">StrategoLang-Coercion</a>]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-Strategy_37_4" id="StrategoLang-Strategy_19_3" title="Referenced at line 37">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="TypeTest_19_25" title="Not referenced">TypeTest</span></span> = [<span class="cons_String">is(</span>[<a href="../signatures-namespaced.sdf3/#StrategoLang-Type_7_7" id="StrategoLang-Type_19_41" title="Defined at ../signatures-namespaced.sdf3 line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-Coercion_18_39" id="StrategoLang-Coercion_20_3" title="Referenced at line 18, 27, 28">StrategoLang-Coercion</a>.<span class="cons_Constructor"><span id="FailC_20_25" title="Not referenced">FailC</span></span> = [<span class="cons_String">fail</span>] { }
  <a href="#StrategoLang-Coercion_18_39" id="StrategoLang-Coercion_21_3" title="Referenced at line 18, 27, 28">StrategoLang-Coercion</a>.<span class="cons_Constructor"><span id="IdC_21_25" title="Not referenced">IdC</span></span> = [<span class="cons_String">id</span>] { }
  <a href="#StrategoLang-Coercion_18_39" id="StrategoLang-Coercion_22_3" title="Referenced at line 18, 27, 28">StrategoLang-Coercion</a>.<span class="cons_Constructor"><span id="RuntimeCheck_22_25" title="Not referenced">RuntimeCheck</span></span> = <a href="../signatures-namespaced.sdf3/#StrategoLang-Type_7_7" id="StrategoLang-Type_22_40" title="Defined at ../signatures-namespaced.sdf3 line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> { }
  <a href="#StrategoLang-SCoercion_28_40" id="StrategoLang-SCoercion_23_3" title="Referenced at line 28">StrategoLang-SCoercion</a>.<span class="cons_Constructor"><span id="SFail_23_26" title="Not referenced">SFail</span></span> = [<span class="cons_String">fail</span>] { }
  <a href="#StrategoLang-SCoercion_28_40" id="StrategoLang-SCoercion_24_3" title="Referenced at line 28">StrategoLang-SCoercion</a>.<span class="cons_Constructor"><span id="SId_24_26" title="Not referenced">SId</span></span> = [<span class="cons_String">id</span>] { }
  <a href="#StrategoLang-SCoercion_28_40" id="StrategoLang-SCoercion_25_3" title="Referenced at line 28">StrategoLang-SCoercion</a>.<span class="cons_Constructor"><span id="SRuntimeCheck_25_26" title="Not referenced">SRuntimeCheck</span></span> = <a href="../signatures-namespaced.sdf3/#StrategoLang-SType_34_7" id="StrategoLang-SType_25_42" title="Defined at ../signatures-namespaced.sdf3 line 34, 38, 39">StrategoLang-SType</a> { }
  <a href="#StrategoLang-Strategy_37_4" id="StrategoLang-Strategy_26_3" title="Referenced at line 37">StrategoLang-Strategy</a> = <a href="#StrategoLang-Proxy_14_52" id="StrategoLang-Proxy_26_27" title="Defined at line 14, 27, 28">StrategoLang-Proxy</a> { }
  <a href="#StrategoLang-Proxy_26_27" id="StrategoLang-Proxy_27_3" title="Referenced at line 26">StrategoLang-Proxy</a>.<span class="cons_Constructor"><span id="Proxy_27_22" title="Not referenced">Proxy</span></span> = [<span class="cons_String">proxy(</span>[<a href="#StrategoLang-Coercion_14_7" id="StrategoLang-Coercion_27_38" title="Defined at line 14, 20, 21, 22">StrategoLang-Coercion</a>]<span class="cons_String">,</span> [<a href="#StrategoLang-Coercion_14_7" id="StrategoLang-Coercion_27_63" title="Defined at line 14, 20, 21, 22">StrategoLang-Coercion</a>]<span class="cons_String">)(</span>[<a href="#StrategoLang-SVar_29_3" id="StrategoLang-SVar_27_88" title="Defined at line 29">StrategoLang-SVar</a>]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-Proxy_26_27" id="StrategoLang-Proxy_28_3" title="Referenced at line 26">StrategoLang-Proxy</a>.<span class="cons_Constructor"><span id="ProxyT_28_22" title="Not referenced">ProxyT</span></span> = [<span class="cons_String">proxy(</span>[{<a href="#StrategoLang-SCoercion_14_29" id="StrategoLang-SCoercion_28_40" title="Defined at line 14, 23, 24, 25">StrategoLang-SCoercion</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="#StrategoLang-Coercion_14_7" id="StrategoLang-Coercion_28_75" title="Defined at line 14, 20, 21, 22">StrategoLang-Coercion</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)(</span>[<a href="#StrategoLang-Coercion_14_7" id="StrategoLang-Coercion_28_107" title="Defined at line 14, 20, 21, 22">StrategoLang-Coercion</a>]<span class="cons_String">,</span> [<a href="#StrategoLang-Coercion_14_7" id="StrategoLang-Coercion_28_132" title="Defined at line 14, 20, 21, 22">StrategoLang-Coercion</a>]<span class="cons_String">)(</span>[<a href="#StrategoLang-SVar_29_3" id="StrategoLang-SVar_28_157" title="Defined at line 29">StrategoLang-SVar</a>]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-SVar_27_88" id="StrategoLang-SVar_29_3" title="Referenced at line 27, 28">StrategoLang-SVar</a> = <span class="cons_Lit">"cast"</span> {<span class="keyword">reject</span>}

<span class="keyword">sorts</span> <span id="StrategoLang-TypedSVar_31_7" title="Not referenced">StrategoLang-TypedSVar</span> <span id="StrategoLang-TypedTVar_31_30" title="Not referenced">StrategoLang-TypedTVar</span>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-StrategyDef_35_3" title="Not referenced">StrategoLang-StrategyDef</span>.<span class="cons_Constructor"><span id="ExtTypedDef_35_28" title="Not referenced">ExtTypedDef</span></span> = [<span class="cons_String">external</span> [<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-MaybeEmptySId_37_3" id="StrategoLang-MaybeEmptySId_35_53" title="Defined at ../../core/strategies-namespaced.sdf3 line 37, 38">StrategoLang-MaybeEmptySId</a>] <span class="cons_String">::</span> [<a href="../signatures-namespaced.sdf3/#StrategoLang-FunTType_34_76" id="StrategoLang-FunTType_35_85" title="Defined at ../signatures-namespaced.sdf3 line 34, 45">StrategoLang-FunTType</a>]] { }
  <span id="StrategoLang-StrategyDef_36_3" title="Not referenced">StrategoLang-StrategyDef</span>.<span class="cons_Constructor"><span id="ExtTypedDefInl_36_28" title="Not referenced">ExtTypedDefInl</span></span> = [<span class="cons_String">external</span> [<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-MaybeEmptySId_37_3" id="StrategoLang-MaybeEmptySId_36_56" title="Defined at ../../core/strategies-namespaced.sdf3 line 37, 38">StrategoLang-MaybeEmptySId</a>]<span class="cons_String">(</span>[{<a href="../../core/terms-namespaced.sdf3/#StrategoLang-ID_7_7" id="StrategoLang-ID_36_86" title="Defined at ../../core/terms-namespaced.sdf3 line 7, 12">StrategoLang-ID</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="../../core/terms-namespaced.sdf3/#StrategoLang-ID_7_7" id="StrategoLang-ID_36_114" title="Defined at ../../core/terms-namespaced.sdf3 line 7, 12">StrategoLang-ID</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [<a href="../signatures-namespaced.sdf3/#StrategoLang-FunTType_34_76" id="StrategoLang-FunTType_36_143" title="Defined at ../signatures-namespaced.sdf3 line 34, 45">StrategoLang-FunTType</a>] <span class="cons_String">=</span>
  [<a href="#StrategoLang-Strategy_18_3" id="StrategoLang-Strategy_37_4" title="Defined at line 18, 19, 26">StrategoLang-Strategy</a>]] { }

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
