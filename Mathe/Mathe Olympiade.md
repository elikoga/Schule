## 591211
### a)
$f(x)=\sqrt{9-x^2}$ fuer $-3\leq x\leq3$

$g(x)=2-\sqrt{9-x^2}$

$\begin{aligned}
&f(x)=g(x)\\
\iff&\sqrt{9-x^2}=2-\sqrt{9-x^2}\\
\iff&2\cdot\sqrt{9-x^2}=2\\
\iff&\sqrt{9-x^2}=1&\text{Die Quadrierung ist aequivalent weil beide Seiten}\geq0 \\
\iff &9-x^2=1\\
\iff &x^2=8\\
\implies &x=-2\sqrt{2}\lor x=2\sqrt{2}
\end{aligned}
$

$\mathbb{L}=\left\{-2\sqrt{2},2\sqrt{2}\right\}$

$f(-2\sqrt{2})=g(-2\sqrt{2})=1$

$f(2\sqrt{2})=g(2\sqrt{2})=1$

Die Koordinaten der 2 gemeinsamen Punkte sind:

$\left(-2\sqrt{2}|1\right)$ und $\left(2\sqrt{2}|1\right)$

### b)

$g_a(x)=a\cdot\sqrt{9-x^2}$

$\begin{aligned}
&f(x)=g_a(x)\\
\iff&\sqrt{9-x^2}=a-\sqrt{9-x^2}\\
\iff&2\sqrt{9-x^2}=a\\
\end{aligned}
$

Es ist erkennbar, dass $a\geq0$

$
\begin{aligned}
\iff&\sqrt{9-x^2}=\dfrac{a}{2}\\
\iff&9-x^2=\left(\dfrac{a}{2}\right)^2\\
\iff&x^2=9-\left(\dfrac{a}{2}\right)^2\\
\iff&x^2=3^2-\left(\dfrac{a}{2}\right)^2\\
\iff&x^2=\left(3+\dfrac{a}{2}\right)\left(3-\dfrac{a}{2}\right)\\
\implies&x=\sqrt{3-\dfrac{a}{2}}\cdot\sqrt{3+\dfrac{a}{2}}\lor
x=-\sqrt{3-\dfrac{a}{2}}\cdot\sqrt{3+\dfrac{a}{2}}\\
\iff&x=\sqrt{9-\dfrac{a^2}{4}}\lor
x=-\sqrt{9-\dfrac{a^2}{4}}
\end{aligned}
$

Es ist erkennbar, dass $3-\dfrac{a}{2}\geq0\land3+\dfrac{a}{2}\geq0$

$\begin{aligned}
\iff &a\leq6\land a\geq-6\\
\iff &-6\leq a\leq 6\\
\iff &0\leq a\leq 6 &| \text{weil } a\geq 0
\end{aligned}$

Die Funktionen haben, wenn $a$ einschliesslich zwischen 0 und 6 liegt gemeinsame Punkte.

$f\left(\sqrt{9-\dfrac{a^2}{4}}\right)=\sqrt{9-\sqrt{9-\dfrac{a^2}{4}}^2}$



## 591212

Zerlegt $g$ $ABCD$ in ein Dreieck und ein Fuenfeck, so wird ein Schnittpunkt mit $ABCD$ $E$ genannt und der andere Schnittpunkt $F$ genannt.

Der Eckpunkt des Quadrates, der das Dreieck einschliesst wird $G$ genannt.
Der gegenueberliegende Punkt wird $I$ gennant, der von $G$ aus hin zu $E$ liegende Eckpunkt wird $H$ gennant und der von $G$ aus hin zu $F$ liegende Eckpunkt wird $J$ gennant.

$GHIJ$ beschreibt (um vielfache von 90 Grad gedreht und um die Diagonalen gespiegelt) dasselbe Quadrat wie $ABCD$.

Der Flaecheninhalt des Schneidenden Dreiecks ist:

$\dfrac{1}{2}\cdot\overline{EG}\cdot\overline{FG}$

Der halbe Flaecheninhalt ist $\dfrac{1}{2}\cdot\overline{HG}\cdot\overline{JG}$

Auch ist festgelegt, dass:

$\overline{EG}\leq\overline{HG}\land\overline{FG}\leq\overline{JG}$

weil sonst die Gerade das Quadrat nicht in eine Dreieck und ein Fuenfeck aufteilt.

Teilt die gerade den Flaecheninhalt entzwei, so gilt:

$\dfrac{1}{2}\cdot\overline{EG}\cdot\overline{FG}=\dfrac{1}{2}\cdot\overline{HG}\cdot\overline{JG}$

$\iff\overline{EG}\cdot\overline{FG}=\overline{HG}\cdot\overline{JG}$

---

Behauptung: $\overline{EG}<\overline{HG}\land\overline{FG}<\overline{JG}$

$\implies\dfrac{\overline{EG}}{\overline{HG}}<1\land\dfrac{\overline{FG}}{\overline{JG}}<1$

$\iff\dfrac{\overline{EG}\cdot\overline{FG}}{\overline{HG}\cdot\overline{JG}}<1$


$\overline{EG}\cdot\overline{FG}=\overline{HG}\cdot\overline{JG}$

$\implies\dfrac{\overline{EG}\cdot\overline{FG}}{\overline{HG}\cdot\overline{JG}}=1$

Wiederspruch; Also:

$\overline{EG}=\overline{HG}\land\overline{FG}=\overline{JG}$

Damit liegt $E$ auf $H$ und $F$ auf $J$ und damit ist g eine Diagonale und geht durch $M$.

---

Teilt $g$ $ABCD$ in zwei Trapeze auf, so nennt man die beiden Schnittpunkte $E$ und $F$ und setzt das Quadrat $GHIJ$ so, dass $E$ auf $GH$ liegt, und dass $F$ auf $IJ$ liegt, und dass alle Eckpunkte von $GHIJ$ auf jeweils den von $ABCD$ liegen.

Der Flaecheninhalt eines der Trapeze ist:

$\dfrac{1}{2}\left(\overline{EH}+\overline{FI}\right)\cdot\overline{HI}\cdot$

Mit

$\overline{EH}\leq\overline{GH}\land \overline{FI}\leq\overline{IJ}$

Der halbe Flaecheninhalt ist:

$\dfrac{1}{2}\cdot\overline{HI}\cdot\overline{IJ}$

Ansatz:

$\dfrac{1}{2}\left(\overline{EH}+\overline{FI}\right)\cdot\overline{HI}\cdot=\dfrac{1}{2}\cdot\overline{HI}\cdot\overline{IJ}$

$\iff\overline{EH}+\overline{FI}=\overline{IJ}$

$\iff\overline{EH}=\overline{IJ}-\overline{FI}=\overline{FJ}$

Die Schnittpunkte $E$ und $F$ sind jeweils gleich weit von den gegenueberliegenden Ecken $H$ und $J$ entfernt.

$g$ geht also durch $M$ weil die Distanzen ueber den Verlauf ueber das Quadrat gleichmaessig von Distanzen vom Punkt $H$ zu Punkt $J$ gehen muessen.

## 591213

Angenommen $x,y \in \mathbb{Z}$

$
\begin{aligned}
&20x^2-19y^2=2019\\
\iff &2\cdot 10x^2-2\cdot 10y^2+y^2=2\cdot 1009+1\\
\iff &y^2=2\cdot 1009+2\cdot 10y^2-2\cdot 10x^2+1\\
\iff &y^2=2\cdot\left(1009+10y^2-10x^2\right)+1 
\end{aligned}
$

$y^2$ ist ungerade.

Wenn eine ganze Zahl gerade ist, dann ist ihr Quadrat auch gerade:

$
a,k\in\mathbb{Z}\\
\begin{aligned}
&a=2k\\
\implies &a^2=4k^2=2\cdot(2k^2)
\end{aligned}
$

Nach Kontraposition gilt:

Wenn das Quadrat einer Ganzzahl ungerade (nicht gerade) ist, so ist diese Ganzzahl ungerade (nicht gerade).

Also ist $y$ ungerade.

Damit gilt:

$
\begin{aligned}
&y=2a+1 &|a\in\mathbb{Z}\\
\implies &y^2=4a^2+4a+1=4(a^2+a)+1\\
\iff &y^2=4b+1&|b=a^2+a \text{ mit } b\in\mathbb{Z}
\end{aligned}
$

$
\begin{aligned}
&20x^2-19y^2=2019\\
\iff &20x^2-76b-19=2019\\
\iff &20x^2-76b=2038 \\
\iff &10x^2-38b=1019 \\
\iff &2\cdot 5x^2-2\cdot 19b = 2\cdot 509+1\\
\iff &2\cdot 5x^2-2\cdot 19b-2\cdot 509=1\\
\iff &2\cdot (5x-19b-509)=1&|c=5x-19b-509\quad c\in\mathbb{Z}\\
\iff &2\cdot c=1\iff c=\dfrac{1}{2}\\
\end{aligned}\\
\dfrac{1}{2}\notin\mathbb{Z},c\in\mathbb{Z},c=\dfrac{1}{2}
$

Die Annahme $x,y \in \mathbb{Z}$ fuehrt zu einem Wiederspruch.

Es gibt keine ganzen Zahlen $x$ und $y$, die die Gleichung erfuellen.