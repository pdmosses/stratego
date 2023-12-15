---
title: modules.sdf3
hide:
  - toc
---

# `modules.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/gradual-types/modules.sdf3]

[pdmosses/stratego/stratego.lang/syntax/gradual-types/modules.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/gradual-types/modules.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.sdf3/#gradual-types/modules_4_3" id="gradual-types/modules_1_8" title="Referenced at ../main.sdf3 line 4">gradual-types/modules</a>
<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_3_3" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/strategies.sdf3/#core/strategies_1_8" id="core/strategies_4_3" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../signatures.sdf3/#gradual-types/signatures_1_8" id="gradual-types/signatures_5_3" title="Defined at ../signatures.sdf3 line 1">gradual-types/signatures</a>

<span class="keyword">context-free syntax</span>

  <span id="Def_9_3" title="Not referenced">Def</span>.<span class="cons_Constructor"><span id="DefHasTypeNoArgs_9_7" title="Not referenced">DefHasTypeNoArgs</span></span> = [[<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_9_28" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>] <span class="cons_String">::</span> [<a href="../signatures.sdf3/#SSimpleFunType_32_35" id="SSimpleFunType_9_37" title="Defined at ../signatures.sdf3 line 32, 37, 38">SSimpleFunType</a>]]
  <span id="Def_10_3" title="Not referenced">Def</span>.<span class="cons_Constructor"><span id="DefHasType_10_7" title="Not referenced">DefHasType</span></span>       = [[<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_10_28" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>]<span class="cons_String">(</span>[{<a href="../signatures.sdf3/#SType_32_20" id="SType_10_35" title="Defined at ../signatures.sdf3 line 32, 34, 35">SType</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [<a href="../signatures.sdf3/#SSimpleFunType_32_35" id="SSimpleFunType_10_54" title="Defined at ../signatures.sdf3 line 32, 37, 38">SSimpleFunType</a>]]
  <span id="Def_11_3" title="Not referenced">Def</span>.<span class="cons_Constructor"><span id="DefHasTType_11_7" title="Not referenced">DefHasTType</span></span>      = [[<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_11_28" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>]<span class="cons_String">(</span>[{<a href="../signatures.sdf3/#SType_32_20" id="SType_11_35" title="Defined at ../signatures.sdf3 line 32, 34, 35">SType</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="../signatures.sdf3/#Type_7_20" id="Type_11_53" title="Defined at ../signatures.sdf3 line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [<a href="../signatures.sdf3/#SSimpleFunType_32_35" id="SSimpleFunType_11_71" title="Defined at ../signatures.sdf3 line 32, 37, 38">SSimpleFunType</a>]]
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
