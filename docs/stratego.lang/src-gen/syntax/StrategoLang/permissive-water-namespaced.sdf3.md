---
title: permissive-water-namespaced.sdf3
hide:
  - toc
---

# `permissive-water-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/permissive-water-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/permissive-water-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <span id="StrategoLang/permissive-water-namespaced_1_8" title="Not referenced">StrategoLang/permissive-water-namespaced</span>


<span class="keyword">context-free syntax</span>

  <span class="keyword">LAYOUT</span>.<span class="cons_Constructor">WATER</span> = <a href="#StrategoLang-WATER_12_3" id="StrategoLang-WATER_6_18" title="Defined at line 12, 13">StrategoLang-WATER</a> { }

<span class="keyword">sorts</span> <span id="WATER_8_7" title="Not referenced">WATER</span><span class="keyword">-LEX</span> <span id="WATERTOKEN_8_17" title="Not referenced">WATERTOKEN</span><span class="keyword">-LEX</span> <span id="WATERTOKENSTART_8_32" title="Not referenced">WATERTOKENSTART</span><span class="keyword">-LEX</span> <span id="WATERTOKENSEPARATOR_8_52" title="Not referenced">WATERTOKENSEPARATOR</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-WATER_6_18" id="StrategoLang-WATER_12_3" title="Referenced at line 6">StrategoLang-WATER</a> = <a href="#StrategoLang-WATERTOKEN_14_3" id="StrategoLang-WATERTOKEN_12_24" title="Defined at line 14">StrategoLang-WATERTOKEN</a> { }
  <a href="#StrategoLang-WATER_6_18" id="StrategoLang-WATER_13_3" title="Referenced at line 6">StrategoLang-WATER</a> = <a href="#StrategoLang-WATERTOKENSEPARATOR_16_3" id="StrategoLang-WATERTOKENSEPARATOR_13_24" title="Defined at line 16">StrategoLang-WATERTOKENSEPARATOR</a> { }
  <a href="#StrategoLang-WATERTOKEN_12_24" id="StrategoLang-WATERTOKEN_14_3" title="Referenced at line 12, 20">StrategoLang-WATERTOKEN</a> = <a href="#StrategoLang-WATERTOKENSTART_15_3" id="StrategoLang-WATERTOKENSTART_14_29" title="Defined at line 15">StrategoLang-WATERTOKENSTART</a> [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]* { }
  <a href="#StrategoLang-WATERTOKENSTART_14_29" id="StrategoLang-WATERTOKENSTART_15_3" title="Referenced at line 14">StrategoLang-WATERTOKENSTART</a> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_] {<span class="keyword">recover</span>}
  <a href="#StrategoLang-WATERTOKENSEPARATOR_13_24" id="StrategoLang-WATERTOKENSEPARATOR_16_3" title="Referenced at line 13">StrategoLang-WATERTOKENSEPARATOR</a> = ~[<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_\ \t<span class="cons_Decimal">\12</span>\r\n\*] {<span class="keyword">recover</span>}

<span class="keyword">lexical restrictions</span>

  <a href="#StrategoLang-WATERTOKEN_14_3" id="StrategoLang-WATERTOKEN_20_3" title="Defined at line 14">StrategoLang-WATERTOKEN</a> -/- [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\_]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
